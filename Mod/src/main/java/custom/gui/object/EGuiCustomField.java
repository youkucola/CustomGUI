package custom.gui.object;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import custom.gui.util.GuiUtil;
import custom.gui.mcobject.GuiCustomField;
import net.minecraft.client.Minecraft;

public class EGuiCustomField implements EGuiObject {

    public int x, y, width, height, id, maxStringLength, textureX, textureY;
    public GuiCustomField instance;
    public String url;

    public EGuiCustomField(JsonObject obj) {
        GuiUtil.writeInObject(new Gson().fromJson(obj, this.getClass()), this);
        if (TextureManager.imageUrls.get(url) == null) {
            TextureManager.downloadImage(url);
        }
    }

    @Override
    public void draw() {
        instance.drawTextBox();
    }

    @Override
    public void init() {
        instance = new GuiCustomField(id, Minecraft.getMinecraft().fontRendererObj, x, y, width, height, textureX, textureY, url);
        instance.setMaxStringLength(maxStringLength);
    }

}
