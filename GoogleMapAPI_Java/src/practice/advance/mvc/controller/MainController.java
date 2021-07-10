package practice.advance.mvc.controller;

import static practice.advance.mvc.common.GoogleMapTemplate.Map;
import static practice.advance.mvc.common.GoogleMapTemplate.downloadMap;
import static practice.advance.mvc.common.GoogleMapTemplate.fileDelete;
import static practice.advance.mvc.common.GoogleMapTemplate.getMap;

import javax.swing.ImageIcon;

import practice.advance.mvc.model.vo.GoogleMap;
import practice.advance.mvc.model.vo.Marker;

public class MainController {

	public static ImageIcon setMap(String location) {
		if (!location.equals(""))
			Map().setCenter(location);

		downloadMap();
		ImageIcon icon = getMap();
		fileDelete();

		return icon;
	}

	public static void addMarker(String location, String size, String color, String label) {
		Marker marker = new Marker();

		marker.setLocation(location);
		// 기본값은 무시 안넣으면 기본값임
		if (!size.equals(GoogleMap.getMarkerSize()[0]) && !size.equals("")) {
			marker.setSize(size);
		}
		if (!color.equals("")) {
			marker.setColor(color);
		}
		if (!label.equals("")) {
			marker.setLabel(label);
		}

		Map().getMarkers().addMarker(marker);
	}

	public static void updateMap(String location, String sizeX, String sizeY, String zoomLevel, String maptype) {
		Map().setChanged(true);
		
		Map().setCenter(location);
		Map().setSizeX(Integer.parseInt(sizeX));
		Map().setSizeY(Integer.parseInt(sizeY));
		Map().setZoom(Integer.parseInt(zoomLevel));
		// 기본값 무시
		if (!maptype.equals(GoogleMap.getMaptypes()[0]))
			Map().setMaptype(maptype);		
	}

}
