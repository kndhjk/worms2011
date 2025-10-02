/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class e {
    private o a;
    public ab a = null;

    public final o a() {
        if (this.a == null) {
            this.a = new o(this);
        }
        return this.a;
    }

    public final int a() {
        return this.a.a;
    }

    public final Object a(Object object, int n2, int n3, int n4, int n5, int n6) {
        if (object == null) {
            object = new int[0 + n6 * n2];
        }
        this.a.a((int[])object, 0, n2, n3, n4, n5, n6);
        return object;
    }

    public e(int n2, int n3) {
        this.a = new u();
        short s2 = (short)n3;
        n3 = (short)n2;
        u u2 = (u)this.a;
        ((u)this.a).a = Image.createImage((int)n3, (int)s2);
        ((ab)u2).a = (short)n3;
        u2.b = s2;
    }

    public e(byte[] object, int n2, int n3) {
        this.a = new u();
        int n4 = n3;
        byte[] byArray = object;
        object = (u)this.a;
        ((u)this.a).a = Image.createImage((byte[])byArray, (int)0, (int)n4);
        object.a = (short)object.a.getWidth();
        object.b = (short)object.a.getHeight();
    }

    public e(String string) {
        this.a = new u(ae.a(string));
    }

    public e() {
        this.a = new u();
    }
}

