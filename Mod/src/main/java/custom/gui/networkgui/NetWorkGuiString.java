package custom.gui.networkgui;

public class NetWorkGuiString extends NetWorkGuiObject {

	public String str;
	public int x, y, color;

	public NetWorkGuiString(String str, int x, int y, int color) {
		this.str = str;
		this.x = x;
		this.y = y;
		this.color = color;
		type = "GuiString";
	}

}