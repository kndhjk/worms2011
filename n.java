/*
 * Decompiled with CFR 0.152.
 */
import com.ea.sdk.SDKMIDlet;
import java.io.IOException;
import java.io.InputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class n {
    public byte[] a;
    public byte[][] a;
    public short[] a;
    public byte[] b;
    public byte[] c;
    public short[][] a;
    public short[] b;
    public byte[] d;
    public byte[][] b;
    public short[][] b;
    public byte a;
    public byte b;
    public byte c;
    public short[] c;
    public byte[] e;
    public byte d;
    public byte e;
    public short[] d = 0;
    public int a;
    public short[] e;
    public int b;
    public o a;
    public int[] a;
    public int[] b;
    public StringBuffer a;
    public boolean a;
    public boolean b = null;
    public r a;
    public g a = new int[2];

    public n() {
        this.b = new int[4];
    }

    public final int a(byte[] byArray, int n2, byte[] byArray2, int n3, short n4, int n5, int n6) {
        int n7 = n6 == 0 ? n4 << 1 : n4;
        if (n5 == n6 || n5 == 1 && n6 != 0) {
            System.arraycopy(byArray, n2, byArray2, n3, n7);
        } else {
            for (n6 = n2; n6 < n2 + n4; ++n6) {
                short s2 = (short)(byArray[n6] & 0xFF);
                n5 = s2;
                if (s2 > 127) {
                    n5 = this.d[n5 - 128];
                }
                int n8 = n3 + 1;
                byArray2[n3] = (byte)(n5 >> 8);
                n3 = n8 + 1;
                byArray2[n8] = (byte)n5;
            }
        }
        return n7;
    }

    public final int a(short s2) {
        int n2 = this.a.a[6] & 0xFF;
        if (s2 == -1) {
            return (this.a.a[5] & 0xFF) + n2;
        }
        return (this.a.b[s2 & 0xFFFF] & 0xFF) + n2;
    }

    public final short a(short s2, int n2) {
        int n3 = this.a.b.length;
        if (n2 == 0) {
            return this.a.c[ae.a(this.a.b, s2, 0, n3 - 1, n3, this)];
        }
        if (s2 < 128 || n2 == this.a[this.d]) {
            return this.a.c[this.a.a[s2] & 0xFFFF];
        }
        return -1;
    }

    public final void a(int[] nArray, int n2) {
        byte by = this.a.a[8];
        if (by == 1) {
            nArray[0] = nArray[0] + n2;
            return;
        }
        if (by == 4) {
            nArray[0] = nArray[0] - n2;
            return;
        }
        if (by == 2) {
            nArray[1] = nArray[1] + n2;
            return;
        }
        if (by == 8) {
            nArray[1] = nArray[1] - n2;
        }
    }

    public final void a(byte s2) {
        int n2 = 0;
        for (short s3 = 1; s3 < s2; s3 = (short)(s3 + 1)) {
            if ((this.a & 1 << s3) == 0) continue;
            ++n2;
        }
        byte[] byArray = new byte[2];
        try {
            InputStream inputStream = SDKMIDlet.a.getClass().getResourceAsStream("/charmap");
            long l2 = n2 << 8;
            inputStream.skip(l2);
            for (n2 = 0; n2 < 128; ++n2) {
                byArray[0] = (byte)inputStream.read();
                byArray[1] = (byte)inputStream.read();
                this.d[n2] = ae.a(byArray, 0);
            }
            inputStream.close();
        }
        catch (IOException iOException) {}
        if (this.a.b != null && (this.a.a[10] & 4) == 0) {
            int n3 = this.a.b.length;
            for (n2 = 128; n2 < 256; n2 = (int)((short)(n2 + 1))) {
                this.a.a[n2] = (short)ae.a(this.a.b, this.d[n2 - 128], 0, n3 - 1, n3, this);
            }
            this.a.a[11] = this.a[this.d];
        }
    }
}

