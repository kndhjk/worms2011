/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class c {
    public byte[] a;
    public int a;
    public int b;
    public int c;
    public byte a;
    private byte[] b;
    private c[] a;

    public c() {
    }

    public c(String string) {
        int n2;
        this.a = 0;
        this.c = this.b = string.length();
        this.a = (byte)65;
        this.a = new byte[this.c];
        for (n2 = 0; n2 < this.a.length; ++n2) {
            this.a[n2] = 0;
        }
        for (n2 = 0; n2 < this.b; ++n2) {
            this.a[n2] = (byte)string.charAt(n2);
        }
    }

    public c(int n2, int n3) {
        this.a = (byte)(n3 | 0x80 | 0x40);
        n3 = n3 == 0 ? n2 << 1 : n2;
        this.a = new byte[n3];
        this.c = n2;
        this.a = 0;
        this.b = 0;
    }

    private boolean a() {
        boolean bl = (this.a & 0x80) != 0;
        return bl;
    }

    public final c a(c c2) {
        if (!this.a()) {
            return this;
        }
        byte by = (byte)(c2.a & 0x3F);
        byte by2 = (byte)(this.a & 0x3F);
        if (by != by2 && by != 1 && by2 != 0) {
            return this;
        }
        int n2 = this.a;
        int n3 = by2 == 0 ? this.b << 1 : this.b;
        ae.a().a(c2.a, c2.a, this.a, n2 + n3, (short)c2.b, by, by2);
        this.b += c2.b;
        return this;
    }

    public final c a(String string) {
        if (!this.a()) {
            return this;
        }
        int n2 = string.length();
        int n3 = this.b;
        this.b += n2;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            short s2 = string.charAt(i2);
            int n5 = n3 + i2;
            c c2 = this;
            if (!c2.a()) continue;
            byte by = (byte)(c2.a & 0x3F);
            if ((s2 = (short)s2) > 127 && by != 0) {
                n4 = s2;
                n n6 = ae.a();
                s2 = (short)(ae.a(n6.d, n4, 0, 127, 128, n6) + 128);
            }
            n4 = c2.a;
            if (by == 0) {
                n5 <<= 1;
            }
            n4 += n5;
            if (by == 0) {
                c2.a[n4++] = (byte)(s2 >> 8);
            }
            c2.a[n4] = (byte)s2;
        }
        return this;
    }

    public final c a(int n2) {
        short s2;
        if (!this.a()) {
            return this;
        }
        if (this.b == null) {
            this.b = new byte[11];
        }
        short s3 = 10;
        long l2 = n2;
        if (n2 < 0) {
            l2 = -l2;
        }
        for (s2 = 10; s2 >= 0; --s2) {
            this.b[s2] = (byte)(l2 % 10L | 0x30L);
            l2 /= 10L;
            if (this.b[s2] == 48) continue;
            s3 = s2;
        }
        if (n2 < 0) {
            this.b[--s3] = 45;
        }
        s2 = (short)(11 - s3);
        n2 = (byte)(this.a & 0x3F);
        int n3 = this.a;
        int n4 = n2 == 0 ? this.b << 1 : this.b;
        ae.a().a(this.b, s3, this.a, n3 + n4, s2, 1, n2);
        this.b += s2;
        return this;
    }

    public final char a(int n2) {
        short s2 = this.a(n2);
        n2 = s2;
        if (s2 > 127 && (this.a & 0x3F) != 0) {
            return (char)ae.a().d[n2 - 128];
        }
        return (char)n2;
    }

    public final short a(int n2) {
        if ((this.a & 0x3F) == 0) {
            n2 = this.a + (n2 << 1);
            return (short)((this.a[n2] & 0xFF) << 8 | this.a[n2 + 1] & 0xFF);
        }
        return (short)(this.a[this.a + n2] & 0xFF);
    }

    private c a(c[] cArray) {
        int n2;
        int n3;
        c c2;
        c c3 = c2;
        c2 = new c();
        c3.a = (byte)(this.a & 0x3F);
        c3.a = 0;
        int n4 = 0;
        for (n3 = 0; n3 < this.b; ++n3) {
            if (this.a(n3) != 92 || ++n3 >= this.b) continue;
            n2 = this.a(n3);
            if (n2 == 92) {
                --n4;
                continue;
            }
            if (n2 < 48 || n2 > 90) continue;
            if ((cArray[n2 -= 48].a & 0x3F) != c3.a && (cArray[n2].a & 0x3F) != 1) {
                c3.a = 0;
            }
            n4 += cArray[n2].b - 2;
        }
        c3.a = (byte)(c3.a | 0x40);
        c3.c = c3.b = (int)((short)(this.b + n4));
        n2 = (c3.a & 0x3F) == 0 ? c3.b << 1 : c3.b;
        c3.a = new byte[n2];
        n2 = 0;
        n3 = 0;
        n4 = (this.a & 0x3F) == 0 ? 2 : 1;
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (this.a(i2) != 92) continue;
            n2 += ae.a().a(this.a, this.a + n3 * n4, c3.a, n2, (short)(i2 - n3), this.a & 0x3F, c3.a & 0x3F);
            n3 = i2++;
            if (i2 >= this.b) continue;
            int n5 = this.a(i2);
            if (n5 == 92) {
                n3 = i2;
                continue;
            }
            if (n5 < 48 || n5 > 90) continue;
            n2 += ae.a().a(cArray[n5 -= 48].a, cArray[n5].a, c3.a, n2, (short)cArray[n5].b, cArray[n5].a & 0x3F, c3.a & 0x3F);
            n3 = i2 + 1;
        }
        ae.a().a(this.a, this.a + n3 * n4, c3.a, n2, (short)(this.b - n3), this.a & 0x3F, c3.a & 0x3F);
        return c3;
    }

    public final c b(c c2) {
        if (this.a == null) {
            this.a = new c[1];
        }
        this.a[0] = c2;
        return this.a(this.a);
    }

    public final c b(String string) {
        if (this.a == null) {
            this.a = new c[1];
        }
        this.a[0] = new c(string);
        this.a[0] = null;
        return this.a(this.a);
    }

    public final int a() {
        return this.a & 0x3F;
    }

    public final void a() {
        if (!this.a()) {
            return;
        }
        this.b = 0;
    }

    public final String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer = new StringBuffer(this.b);
        for (int i2 = 0; i2 < this.b; ++i2) {
            stringBuffer2.append(this.a(i2));
        }
        return stringBuffer2.toString();
    }
}

