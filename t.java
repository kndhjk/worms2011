/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class t
extends Canvas {
    private int a;
    private int b;
    private int c;
    private int d;
    private o a = new o();

    public static boolean a(int n2) {
        n2 = (ae.a().a.a & n2) != 0 ? 1 : 0;
        return n2 != 0;
    }

    public static boolean b(int n2) {
        n2 = (ae.a().a.b & n2) != 0 ? 1 : 0;
        return n2 != 0;
    }

    public static boolean c(int n2) {
        n2 = t.b(n2) || (0 & n2) != 0 ? 1 : 0;
        return n2 != 0;
    }

    public static boolean d(int n2) {
        n2 = (ae.a().a.c & 0x1010) != 0 ? 1 : 0;
        return n2 != 0;
    }

    public static void a(int n2) {
        t t2 = ae.a().a;
        ae.a().a.d = 0;
        t2.a = 0;
        t2.b = 0;
        t2.c = 0;
    }

    public static long a() {
        return ae.a() - ae.a().a;
    }

    public final int getWidth() {
        return ae.b(ae.a());
    }

    public final int getHeight() {
        return ae.a(ae.a());
    }

    public final void b(int n2) {
        if (n2 != 0 && (n2 & n2 - 1) == 0) {
            this.b(n2, true);
        }
    }

    public final void c(int n2) {
        if (n2 != 0 && (n2 & n2 - 1) == 0) {
            this.b(n2, false);
        }
    }

    public final void keyPressed(int n2) {
        this.a(ae.a(n2), true);
    }

    public final void keyReleased(int n2) {
        this.a(ae.a(n2), false);
    }

    public final void keyRepeated(int n2) {
    }

    public t() {
        ae.c();
        ae.c();
    }

    public final void a() {
        if (this.d > 0) {
            --this.d;
        }
        this.b = 0;
        this.c = 0;
    }

    public final void a(ae object) {
        ae ae2 = object;
        object = this.a;
        if (((o)object).a) {
            ((o)object).a = null;
            ((o)object).a = false;
        }
        ((o)object).a = ae2;
        ae.a().a.a(this.a);
    }

    public final void paint(Graphics graphics) {
    }

    public final void a(int n2, boolean bl) {
        int n3;
        int n4;
        if (this.d > 0) {
            return;
        }
        switch (n2) {
            case 1: {
                n4 = 1;
                break;
            }
            case 2: {
                n4 = 2;
                break;
            }
            case 3: {
                n4 = 4;
                break;
            }
            case 4: {
                n4 = 8;
                break;
            }
            case 7: {
                n4 = 16;
                break;
            }
            case 8: {
                n4 = 0x100000;
                break;
            }
            case 9: {
                n4 = 524288;
                break;
            }
            case 10: {
                n4 = 0x800000;
                break;
            }
            case 11: {
                n4 = 0x200000;
                break;
            }
            case 12: {
                n4 = 0x400000;
                break;
            }
            case 13: {
                n4 = 32;
                break;
            }
            case 14: {
                n4 = 64;
                break;
            }
            case 15: {
                n4 = 262144;
                break;
            }
            case 16: {
                n4 = 131072;
                break;
            }
            case 17: {
                n4 = 128;
                break;
            }
            case 18: {
                n4 = 256;
                break;
            }
            case 19: {
                n4 = 512;
                break;
            }
            case 20: {
                n4 = 1024;
                break;
            }
            case 21: {
                n4 = 2048;
                break;
            }
            case 22: {
                n4 = 4096;
                break;
            }
            case 23: {
                n4 = 8192;
                break;
            }
            case 24: {
                n4 = 16384;
                break;
            }
            case 25: {
                n4 = 32768;
                break;
            }
            case 26: {
                n4 = 65536;
                break;
            }
            default: {
                n4 = n3 = 0;
            }
        }
        if (n4 == 0) {
            if (ae.b(n2) != 0) {
                t.a();
                if (bl) {
                    return;
                }
                return;
            }
        } else {
            this.b(n3, bl);
        }
    }

    public final void a(int n2, int n3) {
        if (this.d > 0) {
            return;
        }
        w w2 = ae.a().a;
        t.a();
        this.getHeight();
        w2.a(n2, n3);
    }

    public final void b(int n2, int n3) {
        if (this.d > 0) {
            return;
        }
        w w2 = ae.a().a;
        t.a();
        w2.b(n2, n3);
    }

    public final void b() {
        if (this.d > 0) {
            return;
        }
        t.a();
    }

    private void b(int n2, boolean bl) {
        t.a();
        w w2 = ae.a().a;
        if (bl) {
            this.b |= n2;
            this.a |= n2;
            w2.a(n2);
            return;
        }
        this.c |= n2;
        this.a &= ~n2;
    }

    static {
        int[] nArray = new int[9];
        int[] nArray2 = nArray;
        nArray[0] = 32;
        nArray2[1] = 1;
        nArray2[2] = 64;
        nArray2[3] = 4;
        nArray2[4] = 16;
        nArray2[5] = 8;
        nArray2[6] = 131072;
        nArray2[7] = 2;
        nArray2[8] = 262144;
    }
}

