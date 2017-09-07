package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;


public class AbstractPath extends AbstractVector {

	protected AbstractPath() {
	}

	/**
	 * Method to redraw path after for position change.
	 */
	public native final void redraw() 
	/*-{
		this.redraw();
	}-*/;

	public native final void setStyle(PathOptions newPathOptions) 
	/*-{
		this.setStyle(newPathOptions);
	}-*/;

	public native final LatLngBounds getBounds() 
	/*-{
		return this.getBounds();
	}-*/;

	public native final JavaScriptObject toGeoJSON() 
	/*-{
		return this.toGeoJSON();
	}-*/;

	public native final String toGeoJSONString()
	/*-{
		return JSON.stringify(this.toGeoJSON());
	}-*/;

	public native final void bindTooltip(String tooltip, TooltipOptions tooltipOptions)
	/*-{
		this.bindTooltip(tooltip, tooltipOptions);
	}-*/;

	public final void bindTooltip(String tooltip) {
		bindTooltip(tooltip, null);
	}

	public native final void bindPopup(String popup, PopupOptions popupOptions) 
	/*-{
		this.bindPopup(popup, popupOptions);
	}-*/;

	public final void bindPopup(String popup) {
		bindPopup(popup, null);
	}

	
}
