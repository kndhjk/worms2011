/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ac
implements k {
    static int a;
    static int[] a;
    private static o a;
    private static int[] h;
    private int d;
    int b;
    private short[] a;
    private short[] b;
    private byte[] a;
    private byte[] p;
    private int e;
    private short[] c;
    private int f;
    private short[] d;
    private short[] e;
    private short[] f;
    private byte[] q;
    private int g;
    private short[] g;
    private int h;
    private byte[] r;
    private byte[] s;
    private short[] h;
    private byte[] t;
    private byte[] u;
    private int i;
    private e[] a;
    private int j;
    private int[] i;
    private byte[] v;
    private int[][] a;
    private int k;
    private static int l;
    static int c;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    public static int[] g;

    static void a(o o2) {
        a = o2;
    }

    ac() {
    }

    ac(int n2) {
        this.k = n2;
        this.b(18 + (n2 << 1));
        this.c(18 + (n2 << 1) + 1);
    }

    final void a() {
        this.a = null;
        this.b = null;
        this.a = null;
        this.p = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.q = null;
        this.g = null;
        this.r = null;
        this.s = null;
        this.h = null;
        this.t = null;
        this.u = null;
        this.a = null;
        this.i = null;
        this.v = null;
        this.a = null;
    }

    private void b(int n2) {
        try {
            int n3;
            b b2 = new b(n2);
            this.d = b2.read() & 0xFF;
            this.b = b2.a() & 0xFFFF;
            if (this.d == 0) {
                this.a = y.a(b2, this.b, null, 0);
                this.b = y.a(b2, this.b, null, 0);
            }
            this.a = new byte[this.b];
            this.p = new byte[this.b];
            b2.read(this.a, 0, this.b);
            b2.read(this.p, 0, this.b);
            this.e = b2.a() & 0xFFFF;
            this.c = new short[this.e + 1];
            this.c[0] = 0;
            int n4 = 0;
            for (n3 = 1; n3 <= this.e; ++n3) {
                this.c[n3] = (short)(n4 += b2.read() & 0xFF);
            }
            this.f = b2.a() & 0xFFFF;
            this.d = y.a(b2, this.f, null, 0);
            this.e = y.a(b2, this.f, null, 0);
            this.f = new short[this.f];
            this.q = new byte[this.f];
            for (n3 = 0; n3 < this.f; ++n3) {
                this.f[n3] = (short)(b2.read() & 0xFF);
            }
            b2.read(this.q, 0, this.f);
            for (n3 = 0; n3 < this.f; ++n3) {
                int n5 = n3;
                this.f[n5] = (short)(this.f[n5] + ((this.q[n3] & 0xD0) << 2));
            }
            this.g = b2.a() & 0xFFFF;
            this.g = new short[this.g + 1];
            this.g[0] = 0;
            n3 = 0;
            for (n4 = 1; n4 <= this.g; ++n4) {
                this.g[n4] = (short)(n3 += b2.read() & 0xFF);
            }
            this.h = b2.a() & 0xFFFF;
            this.r = new byte[this.h];
            this.s = new byte[this.h];
            this.h = new short[this.h];
            this.t = new byte[this.h];
            this.u = new byte[this.h];
            b2.read(this.r, 0, this.h);
            b2.read(this.s, 0, this.h);
            for (n4 = 0; n4 < this.h; ++n4) {
                this.h[n4] = (short)(b2.read() & 0xFF);
            }
            b2.read(this.t, 0, this.h);
            b2.read(this.u, 0, this.h);
            for (n4 = 0; n4 < this.h; ++n4) {
                int n6 = n4;
                this.h[n6] = (short)(this.h[n6] + ((this.u[n4] & 0xD0) << 2));
            }
            b2.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void c(int n2) {
        try {
            if (this.d == 1) {
                int n3;
                int n4;
                b b2 = new b(n2);
                this.j = b2.read() & 0xFF;
                int n5 = b2.read() & 0xFF;
                int n6 = b2.read() & 0xFF;
                int n7 = b2.read() & 0xFF;
                this.a = new int[n6][];
                block6: for (n4 = 0; n4 < n6; ++n4) {
                    this.a[n4] = new int[n7];
                    switch (n5) {
                        case 129: {
                            for (n3 = 0; n3 < n7; ++n3) {
                                this.a[n4][n3] = b2.a();
                            }
                            continue block6;
                        }
                        case 5: {
                            short[] sArray = y.a(b2, n7, null, 0);
                            for (int i2 = 0; i2 < n7; ++i2) {
                                int n8 = sArray[i2];
                                n8 = (n8 & 0xFFFF) == 63519 ? 0xFF00FF : 0xFF000000 | (n8 & 0xF800) << 8 | (n8 & 0x7E0) << 5 | (n8 & 0x1F) << 3;
                                this.a[n4][i2] = n8;
                            }
                            continue block6;
                        }
                    }
                }
                this.i = new int[this.b + 1];
                n4 = 0;
                for (n3 = 0; n3 < this.b; ++n3) {
                    this.i[n3] = n4;
                    n4 += b2.a() & 0xFFFF;
                }
                this.i[this.b] = n4;
                this.v = new byte[n4];
                b2.read(this.v, 0, n4);
                b2.close();
                return;
            }
            this.a = new e[1];
            this.a[0] = b.a(n2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    final void b() {
        this.i = 0;
    }

    private static int c(int n2, int n3) {
        if ((n2 & 4) == 0) {
            return n2 ^ n3;
        }
        if ((n3 & 1) != 0) {
            n2 ^= 2;
        }
        if ((n3 & 2) != 0) {
            n2 ^= 1;
        }
        if ((n3 & 4) != 0) {
            n2 ^= 7;
        }
        return n2;
    }

    final void a(int n2, int n3, int n4, int n5, int n6) {
        n2 = this.g[n2] + n3;
        this.a(this.h[n2] & 0xFFFF, n4 + this.r[n2], n5 + this.s[n2], ac.c(this.u[n2] & 7, n6));
    }

    final void a(int n2, int n3, int n4, int n5) {
        int n6 = this.c[n2 + 1] - this.c[n2];
        for (int i2 = 0; i2 < n6; ++i2) {
            int n7 = i2;
            ac ac2 = this;
            int n8 = ac2.c[n2] + n7;
            n7 = ac2.d[n8];
            int n9 = ac2.e[n8];
            int n10 = ac2.f[n8] & 0xFFFF;
            n8 = ac2.q[n8] & 7;
            if ((n5 & 7) != 0) {
                int n11;
                int n12;
                if ((n8 & 4) == 0) {
                    n12 = ac2.a[n10] & 0xFF;
                    n11 = ac2.p[n10] & 0xFF;
                } else {
                    n12 = ac2.p[n10] & 0xFF;
                    n11 = ac2.a[n10] & 0xFF;
                }
                if ((n5 & 1) != 0) {
                    n7 = -n7 - n12;
                }
                if ((n5 & 2) != 0) {
                    n9 = -n9 - n11;
                }
                if ((n5 & 4) != 0) {
                    n12 = n7;
                    n7 = -n9 - n11;
                    n9 = n12;
                }
                n8 = ac.c(n8, n5);
            }
            ac2.b(n10, n3 + n7, n4 + n9, n8);
        }
    }

    final void b(int n2, int n3, int n4, int n5) {
        if (a == 0) {
            int n6 = ((ac)object).a[n2] & 0xFF;
            int n7 = ((ac)object).p[n2] & 0xFF;
            if (((ac)object).d == 0) {
                if (((ac)object).a == null) {
                    return;
                }
            } else {
                Object object = ((ac)object).a(n2, n5, 0);
                if ((n5 & 4) == 0) {
                    a.a((int[])object, n6, n3, n4, n6, n7);
                    return;
                }
                a.a((int[])object, n7, n3, n4, n7, n6);
                return;
            }
            e e2 = ((ac)object).a[0];
            int n8 = ((ac)object).a[n2] & 0xFFFF;
            int n9 = ((ac)object).b[n2] & 0xFFFF;
            if (((ac)object).k == 1) {
                if (ai.b(n2)) {
                    int n10 = l == -1 || !ai.b(n2) ? -1 : 0 + (n2 - 11) + (l << 2);
                    if (n10 >= 0) {
                        y.a[4].a(n10, n3, n4, n5);
                    }
                    return;
                }
                if (ai.c(n2)) {
                    int n11 = ai.a(n2, c);
                    if (n11 >= 0) {
                        n2 = 0;
                        int n12 = 0;
                        if (n11 >= 79 && n11 < 82) {
                            n2 = -10;
                            if ((n5 & 1) != 0) {
                                n2 = 10;
                            }
                            n12 = 8;
                        }
                        if (c == 12 || c == 30) {
                            n8 = 3;
                            if (c == 30) {
                                n8 = 2;
                            }
                            n9 = n8;
                            n7 = n4 + n12;
                            n6 = n3 + n2;
                            Object object = y.a[2];
                            n9 = ((ac)object).c[n11] + n9;
                            ac.a[0] = ((ac)object).d[n9] + n6;
                            ac.a[1] = ((ac)object).e[n9] + n7;
                            object = a;
                            if ((n5 & 1) == 1) {
                                object[0] = 2 * (n3 + n2) - object[0];
                            }
                            ai.i = (int)object[0];
                            ai.j = (int)object[1];
                        }
                        y.a[2].a(n11, n3 + n2, n4 + n12, n5);
                    }
                    return;
                }
                if (n2 == 202) {
                    y.a[5].a(19, y.n % 2, n3, n4, 0);
                    return;
                }
            }
            if (e2 != null) {
                a.a(e2, n8, n9, n6, n7, h[n5], n3, n4, 20);
            }
            return;
        }
        if (a == 2) {
            if (g != null) {
                a.a(g, 64, n3, n4, 64, 64);
                return;
            }
        } else if (a == 1) {
            int n13 = ((ac)object).a[n2] & 0xFF;
            int n14 = ((ac)object).p[n2] & 0xFF;
            if ((n5 & 4) != 0) {
                int n15 = n13;
                n13 = n14;
                n14 = n15;
            }
            if (((ac)object).k == 1) {
                if (y.a != null && ai.a(n2, c) >= 0) {
                    return;
                }
                if (ai.b(n2) && l >= 0) {
                    return;
                }
            }
            y.a(a, a, y.a(y.l, n3, n4, n13, n14));
        }
    }

    static void a(int n2) {
        l = n2;
    }

    final int[] a(int n2, int n3, int n4, int n5) {
        y.a(a, 0x40000000, 0x40000000, -1073741824, -1073741824);
        int n6 = a;
        a = 1;
        this.a(n2, n3, n4, n5);
        a = n6;
        return a;
    }

    final int a(int n2) {
        return this.g[n2 + 1] - this.g[n2];
    }

    final int a(int n2, int n3) {
        return this.t[this.g[n2] + n3] & 0xFF;
    }

    final int b(int n2, int n3) {
        return this.h[this.g[n2] + n3] & 0xFF;
    }

    final int[] a(int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = this.a[n2] & 0xFF;
        int n8 = this.p[n2] & 0xFF;
        int[] nArray = this.a[n4];
        int[] nArray2 = new int[n7 * n8];
        int n9 = n7;
        int n10 = n8;
        if ((n3 & 4) != 0) {
            n9 = n8;
            n10 = n7;
        }
        int n11 = n10;
        int n12 = n9;
        m = 0;
        n = 0;
        o = n12;
        p = n11;
        int[] nArray3 = nArray;
        int n13 = this.i[n2];
        int n14 = n7;
        int n15 = n8;
        n8 = n3;
        n7 = n9;
        nArray = nArray2;
        n3 = n15;
        n2 = n14;
        int n16 = n13;
        byte[] byArray = this.v;
        int[] nArray4 = nArray3;
        int n17 = this.j;
        n9 = Math.max(0, 0);
        n10 = Math.max(0, 0);
        if ((n8 & 4) != 0) {
            n6 = n3;
            n5 = n2;
        } else {
            n6 = n2;
            n5 = n3;
        }
        n6 = Math.min(o, n6);
        n5 = Math.min(p, n5);
        if ((n6 -= n9) > 0 && (n5 -= n10) > 0) {
            int n18 = 0;
            int n19 = 0;
            int n20 = 0;
            int n21 = 0;
            int n22 = 0;
            int n23 = 0;
            switch (n8) {
                case 0: {
                    n21 = n10 * n7 + n9;
                    n22 = n7 - n6;
                    n23 = 1;
                    n18 = n10 * n2 + n9;
                    n19 = n2 - n6;
                    n20 = n5;
                    break;
                }
                case 1: {
                    n21 = n10 * n7 + n9 + n6 - 1;
                    n22 = n7 + n6;
                    n23 = -1;
                    n18 = n10 * n2 + n2 - n9 - n6;
                    n19 = n2 - n6;
                    n20 = n5;
                    break;
                }
                case 2: {
                    n21 = (n10 + n5 - 1) * n7 + n9;
                    n22 = -n7 - n6;
                    n23 = 1;
                    n18 = (n3 - n10 - n5) * n2 + n9;
                    n19 = n2 - n6;
                    n20 = n5;
                    break;
                }
                case 3: {
                    n21 = (n10 + n5 - 1) * n7 + n9 + n6 - 1;
                    n22 = -n7 + n6;
                    n23 = -1;
                    n18 = (n3 - n10 - n5) * n2 + n2 - n9 - n6;
                    n19 = n2 - n6;
                    n20 = n5;
                    break;
                }
                case 4: {
                    n21 = n10 * n7 + n9 + n6 - 1;
                    n22 = -n5 * n7 - 1;
                    n23 = n7;
                    n18 = (n3 - n9 - n6) * n2 + n10;
                    n19 = n2 - n5;
                    n20 = n6;
                    break;
                }
                case 5: {
                    n21 = (n10 + n5 - 1) * n7 + n9 + n6 - 1;
                    n22 = n5 * n7 - 1;
                    n23 = -n7;
                    n18 = (n3 - n9 - n6) * n2 + n2 - n10 - n5;
                    n19 = n2 - n5;
                    n20 = n6;
                    break;
                }
                case 6: {
                    n21 = n10 * n7 + n9;
                    n22 = -n5 * n7 + 1;
                    n23 = n7;
                    n18 = n9 * n2 + n10;
                    n19 = n2 - n5;
                    n20 = n6;
                    break;
                }
                case 7: {
                    n21 = (n10 + n5 - 1) * n7 + n9;
                    n22 = n5 * n7 + 1;
                    n23 = -n7;
                    n18 = n9 * n2 + n2 - n10 - n5;
                    n19 = n2 - n5;
                    n20 = n6;
                }
            }
            n2 -= n19;
            block10 : switch (n17) {
                case 17: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: {
                    n3 = n17 - 17 + 1;
                    n7 = (1 << n3) - 1;
                    n16 += (n18 *= n3) >> 3;
                    n8 = 8 - (n18 & 7);
                    n9 = byArray[n16++] << n8 - n3;
                    n10 = 0;
                    while (true) {
                        n17 = 0;
                        while (n17 < n2) {
                            if ((n8 -= n3) < 0) {
                                n8 += 8;
                                n9 = n9 << 8 | byArray[n16++] & 0xFF;
                            }
                            n6 = n9 >> n8 & n7;
                            if ((n6 = nArray4[n6]) < 0) {
                                nArray[n21] = n6;
                            }
                            ++n17;
                            n21 += n23;
                        }
                        if (++n10 >= n20) break block10;
                        n21 += n22;
                        if ((n8 -= n3 * n19) >= 0) continue;
                        n16 += Math.abs(n8) >> 3;
                        n8 = -(Math.abs(n8) & 7) + 8;
                        n9 = ((byArray[n16 - 1] & 0xFF) << 8 | byArray[n16++] & 0xFF) << n8 - n3;
                    }
                }
                case 49: {
                    break;
                }
                case 50: {
                    int n24 = n19;
                    int n25 = n18;
                    n17 = n20;
                    n10 = n23;
                    n9 = n22;
                    n8 = n21;
                    int[] nArray5 = nArray;
                    int n26 = n2;
                    n3 = n16;
                    byte[] byArray2 = byArray;
                    int[] nArray6 = nArray4;
                    n6 = 0;
                    n5 = -1;
                    while (n25 > 0) {
                        if (((n5 = byArray2[n3++] & 0xFF) & 0x80) != 0) {
                            n6 = byArray2[n3++] & 0xFF;
                            n18 = (n5 &= 0x7F) + 1;
                            if (n18 > n25) {
                                n5 -= n25;
                                n25 = 0;
                                continue;
                            }
                            n5 = -1;
                            n25 -= n18;
                            continue;
                        }
                        n5 = -1;
                        --n25;
                    }
                    n18 = 0;
                    while (true) {
                        n19 = n26;
                        if (n5 >= 0) {
                            n25 = n5 + 1;
                            if (n25 > n26) {
                                n5 -= n26;
                                n25 = n26;
                                n19 = 0;
                            } else {
                                n19 = n26 - n25;
                                n5 = -1;
                            }
                            n20 = nArray6[n6];
                            while (n25 > 0) {
                                nArray5[n8] = n20;
                                --n25;
                                n8 += n10;
                            }
                        }
                        while (n19 > 0) {
                            if (((n5 = byArray2[n3++] & 0xFF) & 0x80) != 0) {
                                n6 = byArray2[n3++] & 0xFF;
                                n25 = (n5 &= 0x7F) + 1;
                                if (n25 > n19) {
                                    n5 -= n19;
                                    n25 = n19;
                                    n19 = 0;
                                } else {
                                    n19 -= n25;
                                    n5 = -1;
                                }
                                n20 = nArray6[n6];
                                while (n25 > 0) {
                                    nArray5[n8] = n20;
                                    --n25;
                                    n8 += n10;
                                }
                                continue;
                            }
                            nArray5[n8] = nArray6[n5];
                            n8 += n10;
                            n5 = -1;
                            --n19;
                        }
                        if (++n18 >= n17) break block10;
                        n8 += n9;
                        n25 = n24 - (n5 + 1);
                        if (n25 <= 0) {
                            n5 -= n24;
                            continue;
                        }
                        do {
                            if (((n5 = byArray2[n3++] & 0xFF) & 0x80) != 0) {
                                n6 = byArray2[n3++] & 0xFF;
                                n20 = (n5 &= 0x7F) + 1;
                                if (n20 > n25) {
                                    n5 -= n25;
                                    n25 = 0;
                                    continue;
                                }
                                n5 = -1;
                                n25 -= n20;
                                continue;
                            }
                            n5 = -1;
                            --n25;
                        } while (n25 > 0);
                    }
                }
                case 51: {
                    if (a != 0) break;
                    int n27 = n19;
                    int n28 = n18;
                    n17 = n20;
                    n10 = n23;
                    n9 = n22;
                    n8 = n21;
                    int[] nArray7 = nArray;
                    int n29 = n2;
                    n3 = n16;
                    byte[] byArray3 = byArray;
                    int[] nArray8 = nArray4;
                    n6 = 0;
                    n5 = -1;
                    n18 = 0;
                    while (n28 > 0) {
                        if (((n5 = byArray3[n3++] & 0xFF) & 0x80) != 0) {
                            n6 = byArray3[n3++] & 0xFF;
                            n19 = (n5 &= 0x7F) + 1;
                            if (n19 > n28) {
                                n5 -= n28;
                                n28 = 0;
                                continue;
                            }
                            n5 = -1;
                            n28 -= n19;
                            continue;
                        }
                        n19 = n5 + 1;
                        if (n19 > n28) {
                            n5 -= n28;
                            n3 += n28;
                            n28 = 0;
                            n18 = 1;
                            continue;
                        }
                        n5 = -1;
                        n28 -= n19;
                        n3 += n19;
                    }
                    n19 = 0;
                    while (true) {
                        n28 = n29;
                        if (n5 >= 0) {
                            n20 = n5 + 1;
                            if (n20 > n29) {
                                n5 -= n29;
                                n20 = n29;
                                n28 = 0;
                            } else {
                                n28 = n29 - n20;
                                n5 = -1;
                            }
                            if (n18 != 0) {
                                while (n20 > 0) {
                                    nArray7[n8] = nArray8[byArray3[n3++] & 0xFF];
                                    --n20;
                                    n8 += n10;
                                }
                            } else {
                                n21 = nArray8[n6];
                                while (n20 > 0) {
                                    nArray7[n8] = n21;
                                    --n20;
                                    n8 += n10;
                                }
                            }
                        }
                        while (n28 > 0) {
                            if (((n5 = byArray3[n3++] & 0xFF) & 0x80) != 0) {
                                n6 = byArray3[n3++] & 0xFF;
                                n20 = (n5 &= 0x7F) + 1;
                                if (n20 > n28) {
                                    n5 -= n28;
                                    n20 = n28;
                                    n28 = 0;
                                } else {
                                    n28 -= n20;
                                    n5 = -1;
                                }
                                n21 = nArray8[n6];
                                while (n20 > 0) {
                                    nArray7[n8] = n21;
                                    --n20;
                                    n8 += n10;
                                }
                                n18 = 0;
                                continue;
                            }
                            n18 = 1;
                            n20 = n5 + 1;
                            if (n20 > n28) {
                                n5 -= n28;
                                n20 = n28;
                                n28 = 0;
                            } else {
                                n28 -= n20;
                                n5 = -1;
                            }
                            while (n20 > 0) {
                                nArray7[n8] = nArray8[byArray3[n3++] & 0xFF];
                                --n20;
                                n8 += n10;
                            }
                        }
                        if (++n19 >= n17) break block10;
                        n8 += n9;
                        n20 = n27 - (n5 + 1);
                        if (n20 <= 0) {
                            n5 -= n27;
                            continue;
                        }
                        do {
                            if (((n5 = byArray3[n3++] & 0xFF) & 0x80) != 0) {
                                n6 = byArray3[n3++] & 0xFF;
                                n5 &= 0x7F;
                            }
                            if ((n21 = n5 + 1) > n20) {
                                n5 -= n20;
                                n20 = 0;
                                continue;
                            }
                            n5 = -1;
                            n20 -= n21;
                        } while (n20 > 0);
                    }
                }
            }
        }
        return nArray2;
    }

    final void a(int[] nArray, int n2, int n3, int n4) {
        n2 = this.c[0];
        n2 = this.f[n2] & 0xFFFF;
        if (this.d == 0) {
            int n5 = this.a[n2] & 0xFFFF;
            n2 = this.b[n2] & 0xFFFF;
            this.a[0].a(nArray, this.a[0].a(), n5, n2, n3, n4);
        }
    }

    static {
        a = new int[4];
        h = new int[]{0, 2, 1, 3, 5, 7, 4, 6};
        l = -1;
        c = -1;
    }
}

