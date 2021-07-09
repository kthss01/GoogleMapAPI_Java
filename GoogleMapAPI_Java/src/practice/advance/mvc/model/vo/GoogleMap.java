package practice.advance.mvc.model.vo;

import javax.swing.JOptionPane;

public class GoogleMap {
	private final static String BASIC_URL = "https://maps.googleapis.com/maps/api/staticmap";
	private String key;
	
	private boolean isChanged; // 상태 변화시 체크
	
	private String center;
	private int zoom;
	private int sizeX;
	private int sizeY;
	
	private StringBuilder sb;
	
	public GoogleMap() {
		key = JOptionPane.showInputDialog("key : ");
	}
	
	public GoogleMap(String center, int zoom, int sizeX, int sizeY) {
		this();
		this.center = center;
		this.zoom = zoom;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public int getZoom() {
		return zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public static String getBasicUrl() {
		return BASIC_URL;
	}

	
	public boolean isChanged() {
		return isChanged;
	}

	public void setChanged(boolean isChanged) {
		this.isChanged = isChanged;
	}

	public void sample() {
		zoom = 12;
		sizeX = 2048;
		sizeY = 2048;
		isChanged = true;
		center = "서울";
	}
	
	// url 생성
	@Override
	public String toString() {
		sb = new StringBuilder();
		
		sb.append(BASIC_URL).append("?");
		
		sb.append("center=").append(center).append("&");
		sb.append("zoom=").append(zoom).append("&");
		sb.append("size=").append(sizeX).append("x").append(sizeY).append("&");
		
		
		sb.append("key=").append(key);
		
		return sb.toString();
	}
	
	
}
