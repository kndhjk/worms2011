/*
 * Decompiled with CFR 0.152.
 */
import com.ea.sdk.SDKMIDlet;
import java.io.IOException;
import java.io.InputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class b
extends InputStream {
    private static boolean a;
    private static int a;
    private static int b;
    private static int[] a;
    private static int[][] a;
    private static int c;
    private static boolean[][] a;
    private static int[] b;
    private static int[][] b;
    private static InputStream a;
    private static int d;
    private static int e;
    private static int f;
    private static final byte[] a;
    private InputStream b;
    private int g = 0;
    private int h;
    private int i;
    private int j;
    private int k;
    private String a;

    private static int a(InputStream inputStream, int n2) {
        int n3 = 0;
        n2 <<= 3;
        for (int i2 = 0; i2 < n2; i2 += 8) {
            n3 |= (inputStream.read() & 0xFF) << i2;
        }
        return n3;
    }

    private static void b() {
        InputStream inputStream = SDKMIDlet.a.getClass().getResourceAsStream("/index");
        try {
            int n2;
            int n3;
            b.a(inputStream, 1);
            a = b.a(inputStream, 2);
            int n4 = b.a(inputStream, 1);
            b = b.a(inputStream, 1);
            int n5 = a;
            int n6 = b;
            a = new int[n5];
            a = new int[n5][n6 + 1];
            for (n3 = 0; n3 < n5; ++n3) {
                b.a[n3] = b.a(inputStream, 2);
                for (n2 = 0; n2 < n6 + 1; ++n2) {
                    b.a[n3][n2] = b.a(inputStream, n4);
                }
                b.a(inputStream, n4);
            }
            int n7 = c = b.a(inputStream, 2);
            int n8 = n6 / 8;
            if (n6 % 8 > 0) {
                ++n8;
            }
            a = new boolean[n7][n6];
            b = new int[n7];
            b = new int[n7][];
            for (n2 = 0; n2 < n7; ++n2) {
                int n9;
                int n10;
                n3 = b.a(inputStream, n8);
                int n11 = 0;
                for (n5 = 0; n5 < n6; ++n5) {
                    boolean[] blArray = a[n2];
                    n10 = n5;
                    n9 = (n3 & 1 << n5) != 0 ? 1 : 0;
                    blArray[n10] = n9;
                    if (!a[n2][n5]) continue;
                    ++n11;
                }
                b.b[n2] = b.a(inputStream, n4);
                b.b[n2] = new int[n11];
                n9 = 0;
                for (n10 = 0; n10 < n6; ++n10) {
                    if (!a[n2][n10]) continue;
                    b.b[n2][n9++] = b.a(inputStream, n4);
                }
            }
        }
        catch (IOException iOException) {}
        a = true;
    }

    private static int[] a(int n2) {
        int n3;
        int n4 = b[n2];
        int[] nArray = a;
        int n5 = 0;
        for (n3 = 0; n3 < a; ++n3) {
            if (nArray[n3] < n2 || n3 <= 0 || nArray[n3 - 1] >= n2) continue;
            n5 = n3;
            break;
        }
        n3 = 0;
        if (n2 == nArray[n5]) {
            n3 = a[n5][0] - n4;
        } else if (++n2 < c) {
            n3 = b[n2] - n4;
        }
        int[] nArray2 = new int[4];
        nArray = nArray2;
        nArray2[0] = n5;
        nArray[1] = n4;
        nArray[2] = n3;
        nArray[3] = 0;
        return nArray;
    }

    public static void a() {
        if (a != null) {
            try {
                a.close();
            }
            catch (IOException iOException) {}
            a = null;
        }
    }

    public static byte[] a(int n2) {
        try {
            b b2;
            b b3 = b2;
            b2 = new b(n2);
            byte[] byArray = new byte[b3.i];
            b3.read(byArray);
            b3.close();
            return byArray;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static e a(int n2) {
        try {
            b b2;
            b b3 = b2;
            b2 = new b(n2);
            Object object = b3;
            byte[] byArray = new byte[((b)object).i];
            ((b)object).read(byArray, 0, ((b)object).i);
            object = new e(byArray, 0, byArray.length);
            b3.close();
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static final e[] a(int n2, int[] nArray) {
        try {
            e[] eArray;
            e[] eArray2 = eArray;
            eArray = new b(11);
            byte[] byArray = new byte[eArray2.i];
            eArray2.read(byArray);
            eArray2.close();
            eArray2 = new e[nArray.length];
            for (int i2 = 0; i2 < eArray2.length; ++i2) {
                if (nArray[i2] != -1) continue;
                eArray2[i2] = q.a(byArray, byArray.length);
                break;
            }
            for (int i3 = 0; i3 < eArray2.length; ++i3) {
                int n3;
                b b2;
                if (nArray[i3] == -1) continue;
                b b3 = b2;
                b2 = new b(nArray[i3]);
                byte[] byArray2 = new byte[b3.i];
                b3.read(byArray2);
                b3.close();
                for (n3 = 0; n3 < byArray.length - 4 && (byArray[n3] != a[0] || byArray[n3 + 1] != a[1] || byArray[n3 + 2] != a[2] || byArray[n3 + 3] != a[3]); ++n3) {
                }
                System.arraycopy(byArray2, 0, byArray, n3 + -4, byArray2.length);
                eArray2[i3] = q.a(byArray, byArray.length);
            }
            return eArray2;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public b(int n2) {
        if (!a) {
            b.b();
        }
        int[] nArray = b.a(n2);
        this.j = nArray[0];
        this.h = nArray[1];
        this.i = nArray[2];
        this.k = nArray[3];
        this.a = "/df" + this.j + "_" + this.k;
        if (a != null && this.j == d && f == this.k && e <= this.h) {
            this.b = a;
            a = null;
            long l2 = this.h - e;
            this.b.skip(l2);
        } else {
            this.b = SDKMIDlet.a.getClass().getResourceAsStream(this.a);
            if (this.h > 0) {
                long l3 = this.h;
                this.b.skip(l3);
            }
        }
        this.g = 0;
    }

    public final void close() {
        if (a != null && a != this.b) {
            a.close();
        }
        a = this.b;
        d = this.j;
        e = this.h + this.g;
        f = this.k;
    }

    public final int read() {
        if (this.g >= this.i) {
            return -1;
        }
        ++this.g;
        return this.b.read();
    }

    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    public final int read(byte[] byArray, int n2, int n3) {
        if (this.g >= this.i) {
            return -1;
        }
        int n4 = n3;
        if (this.g + n3 > this.i) {
            n4 = this.i - this.g;
        }
        n3 = n2;
        byte[] byArray2 = byArray;
        if ((n4 = this.b.read(byArray, n3, n4)) != -1) {
            this.g += n4;
        }
        return n4;
    }

    public final short a() {
        return (short)(this.read() & 0xFF | (this.read() & 0xFF) << 8);
    }

    public final int a() {
        return this.read() | this.read() << 8 | this.read() << 16 | this.read() << 24;
    }

    public final int available() {
        return this.i - this.g;
    }

    public final long skip(long l2) {
        long l3 = l2;
        if ((l2 = this.b.skip(l3)) > 0L) {
            this.g = (int)((long)this.g + l2);
        }
        return l2;
    }

    public final void reset() {
        this.b = SDKMIDlet.a.getClass().getResourceAsStream(this.a);
        long l2 = this.h;
        this.b.skip(l2);
        this.g = 0;
    }

    static {
        d = -1;
        e = -1;
        f = -1;
        byte[] byArray = new byte[4];
        byte[] byArray2 = byArray;
        byArray[0] = 80;
        byArray2[1] = 76;
        byArray2[2] = 84;
        byArray2[3] = 69;
        a = byArray2;
    }
}

