/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class u
extends ab {
    public Image a;

    public u() {
    }

    public u(x object) {
        String string;
        String string2 = string;
        string = new String(ae.a((x)object));
        object = string2;
        if (string2.charAt(0) != '/') {
            object = '/' + string2;
        }
        try {
            this.a = Image.createImage((String)object);
        }
        catch (Exception exception) {}
        if (this.a != null) {
            ((ab)this).a = (short)this.a.getWidth();
            this.b = (short)this.a.getHeight();
        }
    }

    public final void a(int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.getRGB(nArray, 0, n3, n4, n5, n6, n7);
    }

    public final Image a() {
        return this.a;
    }
}

