package practice.advance.mvc.model.vo;

public class Marker {
	private String size = ""; // tiny, mid, small 중 하나 안쓰면 default(normal) "" 시 normal로 처리할 예정
	private String color = ""; // black, brown, green, purple, yellow, blue, gray, orange, red, white 중 하나 또는 0xFFFFCC 같은 32-bit hex color
	private String label = ""; // A-Z, 0-9 대문자 하나 인거 같음 한글 되는진 모르겠음 tiny, small 시엔 안보임
	private String location; // 위치 주소나 위도,경도로 표현
	
	public Marker() {
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		if(!size.equals("")) sb.append("size=").append(size).append("|");
		if(!color.equals("")) sb.append("color=").append(color).append("|");
		if(!label.equals("")) sb.append("label=").append(label).append("|");
		sb.append(location);
		
		
		return sb.toString();
	}
	
	
}