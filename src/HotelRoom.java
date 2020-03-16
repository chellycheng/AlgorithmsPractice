package test;

import java.util.HashMap;
import java.util.Map;

public class HotelRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] A = {"+1A","+3E","-3E", "+3E", "-1A", "+4F", "+1A", "-3E"};
		
		Map<String,Integer> map =new HashMap<String,Integer> (){
			{
				for(int i =0;i<10;i++) {
					for(int j = 'A';j<='Z';j++) {
						String key = i+""+(char)j;
						put(key, 0);
					}
				}
			}
		};
		//printMap(map);
		int max =0;
		String max_room = "";
		for(String a : A) {
			char sign = a.charAt(0);
			String room = a.substring(1);

			if(sign=='+') {
				map.put(room, map.get(room) + 1);
				int newv = map.get(room);
				if(max<newv) {
					max = newv;
					max_room = room;
				}
				else if(max==newv) {
					if(max_room.compareTo(room)>0) {
						max_room = room;
					}
				}
			}
		}
		System.out.println(max_room);
		
	}
	
	public static void printMap(Map map) {
		map.forEach((key, value) -> System.out.println(key + ":" + value));
	}

}
