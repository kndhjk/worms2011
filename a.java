/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class a
implements k {
    private static int bR = (y.a + 64 - 1) / 64 + 2;
    private static int bS = 9;
    static int a = 2;
    private static int bT;
    private static long e;
    private static int[] g;
    private static short[][] a;
    static int b;
    private static int bU;
    static boolean a;
    private static boolean l;
    static boolean b;
    static boolean c;
    static boolean d;
    static boolean e;
    static boolean f;
    private static int[] h;
    static boolean g;
    static int c;
    static int[] a;
    private static int bV;
    public static int d;
    public static int e;
    public static int f;
    private static int bW;
    private static int bX;
    public static boolean h;
    private static int bY;
    static int g;
    static int h;
    private static int bZ;
    private static int ca;
    public static int i;
    public static int j;
    private static int cb;
    private static int cc;
    public static int k;
    public static boolean i;
    private static boolean m;
    private static int cd;
    private static int ce;
    private static int cf;
    private static int cg;
    private static byte[] p;
    public static int l;
    private static int ch;
    private static int ci;
    private static int cj;
    private static int ck;
    private static int cl;
    private static int[][][] a;
    private static int cm;
    private static int cn;
    private static int[][] b;
    private static int[] i;
    private static int co;
    private static int[][] c;
    private static int cp;
    static int[][] a;
    private static int cq;
    private static int cr;
    private static int cs;
    private static int ct;
    private static int cu;
    private static int cv;
    static int m;
    static int n;
    private static int cw;
    private static int cx;
    private static int cy;
    private static int cz;
    static int o;
    static int p;
    static ai[] a;
    private static ai[][] a;
    private static int[] j;
    static ai a;
    static byte[] a;
    static int q;
    static int r;
    static int s;
    static int t;
    static int u;
    static int v;
    static int w;
    static int x;
    static int y;
    static boolean j;
    static int z;
    static int A;
    private static byte[] q;
    static int B;
    static int C;
    static int D;
    public static long a;
    private static long f;
    private static long g;
    public static long b;
    public static int E;
    public static long c;
    public static long d;
    public static boolean k;
    private static int cA;
    private static int cB;
    private static s[] a;
    private static s[] b;

    static void a() {
        cB = 0;
        cA = 0;
        a = null;
        b = null;
        System.gc();
        b = null;
        a = null;
        if (a != null) {
            for (int i2 = 0; i2 < 90; ++i2) {
                if (a[i2] == null) continue;
                a.a[i2] = null;
            }
        }
        cm = 0;
        cn = 0;
        d = 0;
        e = 0;
        System.gc();
        a.o();
        y.n = false;
        System.gc();
    }

    static void a(boolean n2, int n3, int n4, int n5) {
        int n6;
        int n7 = 0;
        e = t.a();
        bT = 0;
        y.a = false;
        a.f();
        s = -1;
        t = 0;
        q = -1;
        r = 0;
        u = -1;
        v = 0;
        w = 0;
        ai.q = 0;
        y.n = false;
        ai.g = false;
        ai.e = false;
        ai.h = false;
        y.bY = 2;
        y.a(y.p, 0);
        y.a(y.o, 0);
        y.a(y.n, 0);
        a = false;
        l = false;
        b = false;
        c = false;
        d = false;
        f = false;
        e = false;
        if (y.d()) {
            f = true;
        }
        a.i();
        cB = 0;
        cA = 0;
        a = new s[250];
        b = new s[250];
        for (n6 = 0; n6 < 250; ++n6) {
            a.a[n6] = new s();
        }
        for (n6 = 0; n6 < 250; ++n6) {
            a.b[n6] = new s();
        }
        y.bU = 0;
        y.cq = 0;
        y.cz = 0;
        p = null;
        a = null;
        System.gc();
        m = 960;
        B = 0;
        n = 384;
        C = 0;
        D = 0;
        b = n - 64;
        y.cd = 32768;
        y.l = false;
        y.f = false;
        y.d = null;
        y.e = null;
        y.h = false;
        k = false;
        y.a.e(0, 0, y.c, y.d);
        if (n2 != 0) {
            n2 = n5;
            n6 = n4;
            if (n6 == -1) {
                n6 = y.e(4);
            }
            if (n2 == -1) {
                cq = y.a.nextInt();
                n2 = a.a();
            }
            B = 0;
            n4 = n6;
            n3 = n2;
            n2 = n3 & 0xFFFF;
            cs = n2 % 101;
            ct = n2 / 101 % 101;
            cq = n3;
            cr = n4;
            cs = (cs << 16) / 50 + 32768;
            ct = (ct << 16) / 50 + 32768;
            cu = 65536 + (a.a() & 0xFFFF);
            cv = 65536 + (a.a() & 0xFFFF) / 2;
            n2 = cr;
            switch (n2) {
                case 0: {
                    co = 4;
                    a.c[0][0] = 1 * cw / 16 << 16;
                    a.c[0][1] = 16 * cx / 16 - 1 << 16;
                    a.c[1][0] = 2 * cw / 16 << 16;
                    a.c[1][1] = 6 * cx / 16 << 16;
                    a.c[2][0] = 14 * cw / 16 << 16;
                    a.c[2][1] = 6 * cx / 16 << 16;
                    a.c[3][0] = 15 * cw / 16 << 16;
                    a.c[3][1] = 16 * cx / 16 - 1 << 16;
                    break;
                }
                case 3: {
                    co = 8;
                    a.c[0][0] = 1 * cw / 16 << 16;
                    a.c[0][1] = 16 * cx / 16 - 1 << 16;
                    a.c[1][0] = 2 * cw / 16 << 16;
                    a.c[1][1] = 6 * cx / 16 << 16;
                    a.c[2][0] = 5 * cw / 16 << 16;
                    a.c[2][1] = 6 * cx / 16 << 16;
                    a.c[3][0] = 6 * cw / 16 << 16;
                    a.c[3][1] = 16 * cx / 16 << 16;
                    a.c[4][0] = 10 * cw / 16 << 16;
                    a.c[4][1] = 16 * cx / 16 << 16;
                    a.c[5][0] = 11 * cw / 16 << 16;
                    a.c[5][1] = 6 * cx / 16 << 16;
                    a.c[6][0] = 14 * cw / 16 << 16;
                    a.c[6][1] = 6 * cx / 16 << 16;
                    a.c[7][0] = 15 * cw / 16 << 16;
                    a.c[7][1] = 16 * cx / 16 - 1 << 16;
                    break;
                }
                case 1: {
                    co = 4;
                    a.c[0][0] = 1 * cw / 16 << 16;
                    a.c[0][1] = 16 * cx / 16 - 1 << 16;
                    a.c[1][0] = 2 * cw / 16 << 16;
                    a.c[1][1] = 12 * cx / 16 << 16;
                    a.c[2][0] = 14 * cw / 16 << 16;
                    a.c[2][1] = 12 * cx / 16 << 16;
                    a.c[3][0] = 15 * cw / 16 << 16;
                    a.c[3][1] = 16 * cx / 16 - 1 << 16;
                    break;
                }
                case 2: {
                    co = 5;
                    a.c[0][0] = 1 * cw / 16 << 16;
                    a.c[0][1] = 16 * cx / 16 - 1 << 16;
                    a.c[1][0] = 2 * cw / 16 << 16;
                    a.c[1][1] = 4 * cx / 16 << 16;
                    a.c[2][0] = 8 * cw / 16 << 16;
                    a.c[2][1] = 16 * cx / 16 - 1 << 16;
                    a.c[3][0] = 14 * cw / 16 << 16;
                    a.c[3][1] = 4 * cx / 16 - 1 << 16;
                    a.c[4][0] = 15 * cw / 16 << 16;
                    a.c[4][1] = 16 * cx / 16 - 1 << 16;
                }
            }
            if (n2 == 1) {
                a.b(n2, k.bA);
            } else {
                a.b(n2, 64);
            }
        } else {
            y.B = 0;
            n2 = 131;
            for (n4 = 0; n4 < n3; ++n4) {
                n2 += 2;
            }
            a.g[n3] = 0;
            n6 = n7 = n2;
            cp = 0;
            try {
                b b2 = null;
                try {
                    b2 = new b(n6);
                    while (b2.available() > 0) {
                        n3 = (b2.read() & 0xFF) + ((b2.read() & 0xFF) << 8);
                        for (n4 = 0; n4 < n3; ++n4) {
                            a.a[a.cp][0] = (short)((b2.read() & 0xFF) + ((b2.read() & 0xFF) << 8)) << 16;
                            a.a[a.cp][1] = (short)((b2.read() & 0xFF) + ((b2.read() & 0xFF) << 8)) << 16;
                            ++cp;
                        }
                    }
                }
                catch (Exception exception) {}
                b2.close();
                b.a();
                System.gc();
            }
            catch (Exception exception) {}
            y.a(q, (byte)0);
            a.z();
        }
        bU = n7;
    }

    private static void a(int n2, int n3, int n4, boolean bl) {
        y.g(n4);
        ac ac2 = y.a[n4];
        int[] nArray = ac2.a(0, 0, 0, 0);
        int n5 = nArray[2] - nArray[0];
        int n6 = nArray[3] - nArray[1];
        n3 += nArray[1];
        if ((n2 += nArray[0]) < B) {
            n2 = B;
        }
        if (n3 < C) {
            n3 = C;
        }
        if (n2 + n5 >= 960 + B) {
            n2 = B + 960 - n5;
        }
        if (n3 + n6 >= 384 + C) {
            n3 = 384 + C - n6;
        }
        nArray = new int[n5 * n6];
        ac2.a(nArray, 0, n5, n6);
        int n7 = n2 / 64;
        int n8 = n3 / 64;
        int n9 = (n2 + n5) / 64;
        n6 = (n3 + n6) / 64;
        for (int i2 = n7; i2 <= n9; ++i2) {
            for (int i3 = n8; i3 <= n6; ++i3) {
                n7 = i2 + i3 * ci;
                if (B / 64 > i2 || i2 >= ci || C / 64 > i3 || i3 >= cj - D / 64) continue;
                int n10 = n3;
                int n11 = n2;
                int[] nArray2 = nArray;
                int n12 = n7 - C / 64 * ci;
                n12 -= (1 + 2 * (n12 / ci)) * (B / 64);
                if (a != null && a[n12] == null) {
                    a.a[n12] = new short[4096];
                    a.p[n7] = 16;
                }
                int n13 = n7 % ci << 6;
                int n14 = n7 / ci << 6;
                for (int i4 = 0; i4 < 64; ++i4) {
                    for (int i5 = 0; i5 < 64; ++i5) {
                        int n15 = n13 - n11 + i4;
                        int n16 = n14 - n10 + i5;
                        if (n15 < 0 || n15 >= n5 || n16 < 0 || n16 * n5 >= nArray2.length || ((n15 = nArray2[n15 + n16 * n5]) & 0xFF000000) == 0 || bl && a.b(n13 + i4, n14 + i5) != 0) continue;
                        a.a(n13 + i4, n14 + i5, (byte)4);
                        a.a[n12][i4 + (i5 << 6)] = y.a(n15);
                    }
                }
                a.i(n7);
            }
        }
    }

    static void b() {
        long l2 = t.a();
        bT = (int)((long)bT + (l2 - e));
        e = l2;
        try {
            if ((y.b() != 7 || y.p != 11 && y.p != 4 && y.p != 7) && (f == 2 || f == 0)) {
                if (t.a(2052)) {
                    if (cb > 0) {
                        cb = 0;
                    }
                    if ((cb -= 13) < -26) {
                        cb = -26;
                    }
                } else if (t.a(8200)) {
                    if (cb < 0) {
                        cb = 0;
                    }
                    if ((cb += 13) > 26) {
                        cb = 26;
                    }
                } else {
                    cb = 0;
                }
                if (t.a(513)) {
                    if (cc > 0) {
                        cc = 0;
                    }
                    if ((cc -= 13) < -26) {
                        cc = -26;
                    }
                } else if (t.a(32770)) {
                    if (cc < 0) {
                        cc = 0;
                    }
                    if ((cc += 13) > 26) {
                        cc = 26;
                    }
                } else {
                    cc = 0;
                }
                if (cb > 0) {
                    if ((i += cb) > m - 15) {
                        i = m - 15;
                    }
                } else if (cb < 0 && (i += cb) < 15) {
                    i = 15;
                }
                if (cc > 0) {
                    if ((j += cc) > b - 10) {
                        j = b - 10;
                    }
                } else if (cc < 0) {
                    j += cc;
                    int n2 = -55;
                    if (y.b() == 7 && (y.a.a[15] == 14 || y.a.a[15] == 28 || y.a.a[15] == 17 || y.a.a[15] == 6 || y.a.a[15] == 17 || y.a.a[15] == 5 || y.a.a[15] == 11) || y.b() == 18) {
                        n2 = 25;
                    }
                    if (j < n2) {
                        j = n2;
                    }
                }
            }
            a.g();
            a.y();
            a.k();
            block21: for (int i2 = 0; i2 < cB; ++i2) {
                s s2 = b[i2];
                if (!s2.a) continue;
                if (s2.a[0] < s2.a[1]) {
                    s2.a[0] = (short)(s2.a[0] + 1);
                    continue;
                }
                s2.a = false;
                switch (s2.a) {
                    case 80: {
                        ai ai2 = a.d(s2.a[2]);
                        if (ai2 == null) continue block21;
                        a.j(ai2.b);
                        continue block21;
                    }
                    case 81: {
                        if (y.a != null && y.a.a[12] == 1) {
                            y.a.b((byte)0);
                        }
                        y.b(s2.a[2], -1, s2.a[1]);
                        if (s2.a[2] <= 0) continue block21;
                        y.s = true;
                        continue block21;
                    }
                    case 82: {
                        int n3;
                        for (n3 = 2; n3 <= 8; ++n3) {
                            if (s2.a[n3] == -1) continue;
                            a.a((int)s2.a[n3]).a = true;
                        }
                        continue block21;
                    }
                    case 83: {
                        int n3;
                        for (n3 = 2; n3 <= 7; ++n3) {
                            if (s2.a[n3] == -1) continue;
                            a.a((int)s2.a[n3]).a = false;
                        }
                        continue block21;
                    }
                    case 84: {
                        if (a.d(s2.a[2]) == null) continue block21;
                        continue block21;
                    }
                    case 85: {
                        if (a.d(s2.a[2]) == null) continue block21;
                        continue block21;
                    }
                    case 86: {
                        a = s2.a[0] > 0;
                        l = s2.a[1] > 0;
                        b = s2.a[2] > 0;
                        c = s2.a[3] > 0;
                        d = s2.a[4] > 0;
                        boolean bl = e = s2.a[5] > 0;
                        if (c) continue block21;
                        j = true;
                        z = y.a();
                        i.b = true;
                        continue block21;
                    }
                    case 87: {
                        ai ai2 = a.d(s2.a[4]);
                        if (ai2 == null) continue block21;
                        int n4 = s2.a[2];
                        int n5 = s2.a[3];
                        a.j(ai2.b);
                        ai2.r = 1;
                        ai2.a = 0;
                        ai2.e(-1);
                        ai2.a[5] = 32768;
                        ai2.h = ai2.a[11];
                        ai2.b(7);
                        ai2.c();
                        ai2.a[18] = 0;
                        ai.p = 0;
                        ai2.n = false;
                        ai2.b((byte)16);
                        ai2.a[10] = 0;
                        ai2.b(48);
                        ai2.d |= 0x40;
                        n5 = ai2.a(n4, n5, false);
                        ai2.a(n4 << 16, n5 << 16);
                        if (!a) continue block21;
                        y.bZ = 0;
                        continue block21;
                    }
                    case 88: {
                        ai ai2 = a.d(s2.a[2]);
                        if (ai2 == null) continue block21;
                        ai2.a[15] = s2.a[0];
                        continue block21;
                    }
                    case 89: {
                        ai ai2 = a.d(s2.a[2]);
                        if (ai2 == null) continue block21;
                        if (s2.a[0] == -1) {
                            y.a(y.b[ai2.a[3]], 0);
                            ai2.a[15] = -1;
                            ai2.b((byte)1);
                            if (i.a != 2) continue block21;
                            i.a(0);
                            continue block21;
                        }
                        y.b[ai2.a[3]][s2.a[0]] = 0;
                        if (y.a == null || y.a != ai2 || y.a.a[15] != s2.a[0]) continue block21;
                        y.a.a[15] = -1;
                        ai2.b((byte)1);
                        if (i.a != 2) continue block21;
                        i.a(0);
                        continue block21;
                    }
                    case 90: {
                        int n4 = s2.a[2] - (y.a >> 1);
                        int n5 = s2.a[3] - (y.b >> 1);
                        a.a(n4, n5);
                        y.c(11);
                        y.cu = s2.a[4];
                        continue block21;
                    }
                    case 91: {
                        ai ai2 = a.d(s2.a[2]);
                        if (ai2 == null) continue block21;
                        ai2.d |= 0x18;
                        if (ai2.a != 19) continue block21;
                        a.a(ai2);
                        continue block21;
                    }
                    case 92: {
                        y.cb = 0;
                        y.c(12);
                        continue block21;
                    }
                    case 95: {
                        while (y.cx >= 0) {
                            y.j(1);
                        }
                        y.e = null;
                        continue block21;
                    }
                    case 93: {
                        ai ai2 = a.d(s2.a[2]);
                        if (ai2 == null) continue block21;
                        y.b[ai2.a[3]][s2.a[0]] = s2.a[1];
                        continue block21;
                    }
                    case 94: {
                        int n3;
                        ai ai2 = a.d(s2.a[4]);
                        if (ai2 == null) continue block21;
                        int n4 = s2.a[2];
                        int n5 = s2.a[3];
                        if (ai2.a == 1 && (ai2.d & 0x18) == 0) {
                            if (s2.a[0] == 1) {
                                ai2.d(n4 << 16, n5 << 16);
                                continue block21;
                            }
                            ai2.c(n4 << 16, n5 << 16);
                            continue block21;
                        }
                        if (ai2.a == 19 && (ai2.d & 0x18) == 0) {
                            n3 = ai2.r;
                            ai2.a(1);
                            ai2.s = -1;
                            ai2.b((int)ai2.a[1]);
                            a.a(ai2);
                            ai2.a[0] = n4 << 16;
                            ai2.a[1] = n5 << 16;
                            ai2.a[0] = 1;
                            ai2.a(n3);
                            continue block21;
                        }
                        ai2.e = n4 << 16;
                        ai2.f = n5 << 16;
                        continue block21;
                    }
                    case 96: {
                        y.h = s2.a[0] == 0;
                    }
                }
            }
            if (ai.i) {
                a.a(8, a);
                return;
            }
            if (y.e(3) == 0) {
                a.a(8, a);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static void a(o o2) {
        try {
            o2.e(0, 0, k.F, k.G);
            ac.a(o2);
            int n2 = d / 5 % 720;
            for (int i2 = 0; i2 <= (y.a - (720 - n2)) / 720 + 1; ++i2) {
                y.a[ch].a(0, i2 * 720 - n2, 0, 0);
            }
            a.e();
            a.b(o2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static void c() {
        int n2 = y.z - 18;
        if (n2 < 0 || n2 > 90) {
            return;
        }
        int n3 = n2 + cl / 2 + n2 / 15 * cl + C / 64 * ci;
        if (p[n3] != 32) {
            int n4 = a.a(n3);
            if (b == null) {
                b = new int[y.a[a.l].b][];
            }
            if (b[n4] == null) {
                a.b[n4] = new int[4096];
                System.arraycopy(y.a[l].a(n4, 0, 0), 0, b[n4], 0, 4096);
            }
            if (a == null) {
                a = new short[90][];
            }
            a.a[n2] = new short[4096];
            int n5 = n3 % ci;
            int n6 = n3 / ci;
            for (int i2 = 0; i2 < 64; ++i2) {
                for (int i3 = 0; i3 < 64; ++i3) {
                    int n7 = a.b((n5 << 6) + i2, (n6 << 6) + i3);
                    if (n7 == 0) continue;
                    int n8 = i2 + (i3 << 6);
                    n3 = b[n4][n8];
                    if (n7 == 2) {
                        a.a((n5 << 6) + i2, (n6 << 6) + i3, (byte)-1);
                        n3 = h[l - 44];
                    } else if (n7 == 3) {
                        a.a((n5 << 6) + i2, (n6 << 6) + i3, (byte)-1);
                        switch (l) {
                            case 44: {
                                n3 = 6005776;
                                break;
                            }
                            case 45: {
                                n3 = 13758170;
                                break;
                            }
                            case 46: {
                                n3 = 16637020;
                                break;
                            }
                            case 47: {
                                n3 = 12612109;
                                break;
                            }
                            case 48: {
                                n3 = 0x8C8C8C;
                            }
                        }
                    } else if (n7 == 4) {
                        a.a((n5 << 6) + i2, (n6 << 6) + i3, (byte)-1);
                        switch (l) {
                            case 44: {
                                n3 = 4151309;
                                break;
                            }
                            case 45: {
                                n3 = 11653562;
                                break;
                            }
                            case 46: {
                                n3 = 16107806;
                                break;
                            }
                            case 47: {
                                n3 = 9126144;
                                break;
                            }
                            case 48: {
                                n3 = 0x737372;
                            }
                        }
                    } else if (n7 == 5) {
                        a.a((n5 << 6) + i2, (n6 << 6) + i3, (byte)-1);
                        switch (l) {
                            case 44: {
                                n3 = 2768645;
                                break;
                            }
                            case 45: {
                                n3 = 10139811;
                                break;
                            }
                            case 46: {
                                n3 = 13936923;
                                break;
                            }
                            case 47: {
                                n3 = 6433792;
                                break;
                            }
                            case 48: {
                                n3 = 0x616361;
                            }
                        }
                    } else if (n7 == 6) {
                        a.a((n5 << 6) + i2, (n6 << 6) + i3, (byte)-1);
                        switch (l) {
                            case 44: {
                                n3 = 923136;
                                break;
                            }
                            case 45: {
                                n3 = 6254436;
                                break;
                            }
                            case 46: {
                                n3 = 8871186;
                                break;
                            }
                            case 47: {
                                n3 = 4659712;
                                break;
                            }
                            case 48: {
                                n3 = 0x363838;
                            }
                        }
                    } else if (n7 == 7) {
                        a.a((n5 << 6) + i2, (n6 << 6) + i3, (byte)-1);
                        switch (l) {
                            case 44: {
                                n3 = 923136;
                                break;
                            }
                            case 45: {
                                n3 = 0x1D1D1D;
                                break;
                            }
                            case 46: {
                                n3 = 4666903;
                                break;
                            }
                            case 47: {
                                n3 = 3610368;
                                break;
                            }
                            case 48: {
                                n3 = 0x1F1D1D;
                            }
                        }
                    }
                    a.a[n2][n8] = y.a(n3);
                }
            }
        }
    }

    static void d() {
        int n2;
        if (a) {
            return;
        }
        System.arraycopy(y.q, 0, y.r, 0, 3);
        y.a(y.q, 0);
        for (n2 = q; n2 < q + r; ++n2) {
            if (a.a[n2].a != 1 || a[n2].b()) continue;
            byte by = a.a[n2].a[3];
            y.q[by] = y.q[by] + a.a[n2].h;
        }
        y.f = true;
        for (n2 = 0; n2 < 3; ++n2) {
            y.s[n2] = (y.r[n2] - y.q[n2]) / 20;
            y.s[n2] = y.s[n2] + ((y.s[n2] > 0 ? 1 : -1) << 1);
        }
        y.b = t.a();
    }

    static void e() {
        y.a(j, 0);
        for (int i2 = 0; i2 < A; ++i2) {
            if (a[i2] != 1) continue;
            ai ai2 = a[i2];
            int n2 = ai2.g;
            if (!y.a(d - 100, e - 80, y.a + 100 + 100, y.b + 80 + 80, (ai2.e >> 16) + ai2.g[0], (ai2.f >> 16) + ai2.g[1], ai2.g[2] - ai2.g[0], ai2.g[3] - ai2.g[1]) && ai2 != y.a) continue;
            a.a[n2][a.j[n2]] = a[i2];
            int n3 = n2;
            j[n3] = j[n3] + 1;
        }
    }

    public static void a(boolean n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        if (n2 != 0) {
            bV = 0;
            n3 = 19;
            if (a != null) {
                a = null;
            }
            a = new int[21];
            for (n10 = 0; n10 < 3; ++n10) {
                switch (l) {
                    case 44: {
                        n3 = a.a(19, 24);
                        break;
                    }
                    case 45: {
                        n3 = a.a(24, 29);
                        break;
                    }
                    case 46: {
                        n3 = a.a(29, 34);
                        break;
                    }
                    case 47: {
                        n3 = a.a(34, 39);
                        break;
                    }
                    case 48: {
                        n3 = a.a(39, 44);
                    }
                }
                int n11 = B + ((n10 + 1) * 15 << 6) / 4;
                n9 = B + n10 * 960 / 4;
                n8 = n3;
                y.g(n8);
                n7 = 0;
                n6 = 0;
                int[] nArray = y.a[n8].a(0, 0, 0, 0);
                for (n5 = 0; n5 < 2; ++n5) {
                    n7 = a.a(n9, n11);
                    for (n6 = 0; a.a(n7, n6) && n6 < n; ++n6) {
                    }
                    if (n6 > C && n6 < C + 384) break;
                }
                a.a(n7, n6 + 5, n8, true);
                a.a[a.bV] = n8;
                a.a[++a.bV] = n7;
                a.a[++a.bV] = n6 + 5;
                a.a[++a.bV] = nArray[0];
                a.a[++a.bV] = nArray[1];
                a.a[++a.bV] = nArray[2];
                a.a[++a.bV] = nArray[3];
                ++bV;
            }
            y.g();
        }
        n3 = 0;
        if (n2 == 0) {
            n3 = bU;
        }
        a = a.a(7, a);
        if (n2 != 0) {
            int[] nArray = y.a;
            q = -1;
            n8 = 0;
            for (n9 = 0; n9 < nArray.length; ++n9) {
                for (n10 = 0; n10 < nArray[n9]; ++n10) {
                    n7 = n8;
                    n5 = 0;
                    n2 = 0;
                    ai ai2 = a.a(1, a);
                    ai2.a[6] = n7 + 256;
                    n6 = 0;
                    block12: while (n6 == 0) {
                        n5 = a.a(292, 1052);
                        n2 = a.a(192, 576);
                        ai2.e = n5 << 16;
                        ai2.f = n2 << 16;
                        if (ai2.b(n5 << 16, n2 << 16)) {
                            if ((n2 = ai2.a(n5, n2, true)) > 24 && n2 < b) {
                                n6 = 1;
                            }
                        } else if ((n2 = ai2.a(n5, n2, false)) < b) {
                            n6 = 1;
                        }
                        if (n6 == 0 || q == -1) continue;
                        for (int i2 = q; i2 < q + n7; ++i2) {
                            if ((Math.abs((a.a[i2].e >> 16) - n5) > Math.abs((a.a[i2].f >> 16) - n2) ? Math.abs((a.a[i2].e >> 16) - n5) : Math.abs((a.a[i2].f >> 16) - n2)) >= 30) continue;
                            n6 = 0;
                            continue block12;
                        }
                    }
                    ai2.a(n5 << 16, n2 << 16);
                    if (q == -1) {
                        q = ai2.b;
                    }
                    ++n8;
                    ai2.f(n9);
                    if (!y.d()) {
                        ai2.d |= 0x10;
                    }
                    if (y.A == 1) {
                        if (y.a[y.bS][1] == 1) {
                            ai2.h = 100;
                            y.B = 3;
                        } else if (ai2.a[3] == 0) {
                            ai2.h = y.a[y.bS][1];
                        } else if (ai2.a[3] == 1) {
                            ai2.h = y.a[y.bS][13];
                        } else if (ai2.a[3] == 2) {
                            ai2.h = y.a[y.bS][14];
                        }
                    }
                    int n12 = n9;
                    y.o[n12] = y.o[n12] + 1;
                }
            }
            r = n8;
            a.c(3, 12);
            a.c(3, 13);
        } else {
            a.f(n3 + 1);
            a.a((short)62, null, false);
            y.g();
        }
        b.a();
        System.gc();
        a.a(50, l, m << 16, 0x1800000);
        a.y();
        a.f();
        if (!a) {
            int n13;
            y.a(y.q, 0);
            for (n13 = q; n13 < q + r; ++n13) {
                if (a.a[n13].a != 1 || a[n13].b()) continue;
                if (y.B == 1 && y.A == 2) {
                    a.a[n13].h = 200;
                }
                byte by = a.a[n13].a[3];
                y.q[by] = y.q[by] + a.a[n13].h;
            }
            y.ce = y.q[0];
            for (n13 = 1; n13 < y.q.length; ++n13) {
                if (y.ce >= y.q[n13]) continue;
                y.ce = y.q[n13];
            }
        }
        j = true;
        for (n4 = 0; n4 < 36; ++n4) {
            y.b[0][n4] = 0;
        }
        y.j[0] = -1;
        y.j[1] = -1;
        y.j[2] = 2;
        y.j[3] = -1;
        y.j[4] = 2;
        y.j[14] = 2;
        y.j[15] = 1;
        y.j[33] = -1;
        y.j[34] = -1;
        y.j[35] = -1;
        y.j[12] = 3;
        y.j[8] = 3;
        if (y.A == 0 || y.A == 2) {
            for (n4 = 0; n4 < 3; ++n4) {
                if (y.B == 1 && y.A == 2) {
                    for (n10 = 0; n10 < 36; ++n10) {
                        y.b[n4][n10] = 0;
                    }
                    y.b[n4][0] = -1;
                    y.b[n4][1] = -1;
                    y.b[n4][3] = -1;
                    y.b[n4][26] = 3;
                    y.b[n4][14] = 4;
                    y.b[n4][20] = 3;
                    y.b[n4][33] = -1;
                    y.b[n4][34] = -1;
                    y.b[n4][35] = -1;
                    continue;
                }
                if (y.B == 4 && y.A == 2) {
                    for (n10 = 0; n10 < 36; ++n10) {
                        y.b[n4][n10] = 0;
                    }
                    y.b[n4][0] = -1;
                    y.b[n4][1] = -1;
                    y.b[n4][3] = -1;
                    y.b[n4][31] = 3;
                    y.b[n4][7] = 3;
                    y.b[n4][8] = 3;
                    y.b[n4][9] = 3;
                    y.b[n4][12] = 3;
                    y.b[n4][14] = 3;
                    y.b[n4][17] = 1;
                    y.b[n4][21] = 3;
                    y.b[n4][30] = 1;
                    y.b[n4][33] = -1;
                    y.b[n4][34] = -1;
                    y.b[n4][35] = -1;
                    continue;
                }
                if (y.B == 5 && y.A == 2) {
                    for (n10 = 0; n10 < 36; ++n10) {
                        y.b[n4][n10] = 0;
                    }
                    y.b[n4][3] = -1;
                    y.b[n4][15] = 1;
                    y.b[n4][9] = -1;
                    y.b[n4][21] = 4;
                    y.b[n4][27] = 3;
                    y.b[n4][32] = 2;
                    y.b[n4][2] = 2;
                    y.b[n4][20] = 2;
                    y.b[n4][14] = 3;
                    y.b[n4][8] = -1;
                    y.b[n4][26] = 4;
                    y.b[n4][33] = -1;
                    y.b[n4][34] = -1;
                    y.b[n4][35] = -1;
                    continue;
                }
                if (y.B == 2 && y.A == 2) {
                    for (n10 = 0; n10 < 36; ++n10) {
                        y.b[n4][n10] = 0;
                    }
                    y.b[n4][0] = -1;
                    y.b[n4][2] = -1;
                    y.b[n4][8] = -1;
                    continue;
                }
                System.arraycopy(y.j, 0, y.b[n4], 0, 36);
                for (n10 = 0; n10 < 36; ++n10) {
                    int[] nArray = y.b[n4];
                    int n14 = n10;
                    nArray[n14] = nArray[n14] + y.k[n10];
                }
            }
        } else if (y.A == 1) {
            if (!y.e) {
                System.arraycopy(y.j, 0, y.b[0], 0, 36);
                for (n4 = 0; n4 < 36; ++n4) {
                    int[] nArray = y.b[0];
                    int n15 = n4;
                    nArray[n15] = nArray[n15] + y.k[n4];
                }
            } else {
                for (n4 = 0; n4 < 36; ++n4) {
                    y.b[0][n4] = -1;
                }
            }
            if (y.d()) {
                j = false;
            }
        }
        for (n4 = 0; n4 < 3; ++n4) {
            y.b[n4][33] = -1;
            y.b[n4][34] = -1;
            y.b[n4][35] = -1;
        }
        a = 0;
        for (n4 = 0; n4 < 3; ++n4) {
            if (y.q[n4] == 0) continue;
            ++a;
        }
        if (y.A == 0 || y.A == 2 && y.C == 0) {
            if (y.A == 0) {
                y.g[0] = y.z[0];
                y.h[0] = y.A[0];
                y.i[0] = y.B[0];
                y.g[1] = y.z[y.a + 1];
                y.h[1] = y.A[y.a + 1];
                y.i[1] = y.B[y.a + 1];
            } else {
                y.g[1] = y.g[0];
                y.g[2] = y.g[0];
                while (y.g[0] == y.g[1] || y.g[1] == y.g[2] || y.g[0] == y.g[2]) {
                    n4 = y.b(0, 4);
                    n10 = y.b(0, 4);
                    y.g[1] = y.z[n4];
                    y.h[1] = y.A[n4];
                    y.i[1] = y.B[n4];
                    y.g[2] = y.z[n10];
                    y.h[2] = y.A[n10];
                    y.i[2] = y.B[n10];
                }
            }
        } else if (y.A == 1) {
            y.g[0] = y.z[0];
            y.h[0] = y.A[0];
            y.i[0] = y.B[0];
            if (y.bS != -1 && !y.d()) {
                y.g[1] = y.z[y.a[y.bS][10] + 1];
                y.h[1] = y.A[y.a[y.bS][10] + 1];
                y.i[1] = y.B[y.a[y.bS][10] + 1];
                if (y.a[y.bS][11] != y.a[y.bS][12]) {
                    y.g[2] = y.z[y.a[y.bS][12] + 1];
                    y.h[2] = y.A[y.a[y.bS][12] + 1];
                    y.i[2] = y.B[y.a[y.bS][12] + 1];
                }
            }
        }
        for (n4 = 0; n4 < A; ++n4) {
            if (a[n4] != 1 || a.a[n4].a != 1) continue;
            a[n4].d(y.g[a.a[n4].a[3]]);
        }
        int[] nArray = new int[5];
        y.a(nArray, 0);
        for (n10 = 0; n10 < A; ++n10) {
            if (a[n10] != 1 || a.a[n10].a != 1 || (n8 = a.a[n10].k) < 0 || n8 >= 5) continue;
            a.a[n10].a[6] = y.A == 1 ? 256 + (n8 << 2) + nArray[n8] : 276 + (n8 << 2) + nArray[n8];
            int n16 = n8;
            nArray[n16] = nArray[n16] + 1;
        }
        c = q;
        ai.l = true;
        int n17 = q;
        for (n2 = 0; n2 < 4; ++n2) {
            ai.h[n2] = n17++;
        }
        for (n17 = 0; n17 < 4; ++n17) {
            k.e[n17] = 0;
            k.f[n17] = 0;
        }
    }

    static void a(int n2) {
        if (ch != -1) {
            y.e(ch);
        }
        if (n2 != -1) {
            l = y.i;
        } else {
            n2 = y.e(5);
            l = n2 + 44;
        }
        try {
            int n3;
            y.d(l);
            switch (l) {
                case 44: {
                    n3 = 49;
                    break;
                }
                case 45: {
                    n3 = 50;
                    break;
                }
                case 46: {
                    n3 = 51;
                    break;
                }
                case 47: {
                    n3 = 52;
                    break;
                }
                case 48: {
                    n3 = 53;
                    break;
                }
                default: {
                    n3 = 44;
                }
            }
            ch = n3;
            y.d(n3);
        }
        catch (Exception exception) {}
        B = 192;
        C = 192;
        D = 64;
        cl = 2 * B / 64;
        ci = 15 + cl;
        cj = 6 + (C + D) / 64;
        m = 960 + 2 * B;
        n = 384 + C + D;
        b = n - 64;
        if (p == null) {
            p = new byte[ci * ci];
        }
        ck = ci * cj;
        y.a(p, (byte)32);
        for (int i2 = 0; i2 < 90; ++i2) {
            int n4;
            n2 = i2 % 15;
            int n5 = i2 / 15;
            int n6 = 0;
            for (n4 = 0; n4 < 64; ++n4) {
                int n7 = (n2 << 6) + (n4 + (n5 << 6)) * 960;
                for (int i3 = 0; i3 < 64; ++i3) {
                    n6 += q[n7 + i3];
                }
            }
            n2 = n6 == 4096 ? 8 : (n6 == 0 ? 32 : 16);
            n4 = i2 + cl / 2 + i2 / 15 * cl + C / 64 * ci;
            a.p[n4] = n2;
        }
    }

    public static void f() {
        h = 30;
        bY = 8;
        g = 0;
        h = false;
        i = k.F / 2;
        j = k.G / 2;
        d = 0;
        e = 0;
    }

    public static void a(int n2, int n3) {
        bW = n2 < 0 ? 0 : n2;
        bX = n3 < 0 ? 0 : n3;
        bZ = i - d;
        ca = j - e;
        bY = 8;
        a.d(1);
    }

    public static void b(int n2) {
        cd = 0;
        m = true;
        switch (n2) {
            case 10: 
            case 23: 
            case 25: {
                ce = 1;
                cf = 10;
                cg = 1;
                return;
            }
        }
        ce = 10;
        cf = 10;
        cg = 5;
    }

    public static void c(int n2) {
        k = n2;
        bY = 8;
        a.d(3);
    }

    static void d(int n2) {
        if (f == n2) {
            return;
        }
        switch (f) {
            case 3: {
                k = -1;
                break;
            }
            case 2: {
                i = d + k.F / 2;
                j = e + k.G / 2;
                break;
            }
            case 0: {
                ai.e = false;
                break;
            }
            case 4: {
                i = false;
            }
        }
        f = n2;
    }

    /*
     * Unable to fully structure code
     */
    static void g() {
        switch (a.f) {
            case 0: {
                if (a.d > a.i - 80 && (a.d = a.i - 80) < 0) {
                    a.d = 0;
                }
                if (a.d < a.i + 80 - y.a && (a.d = a.i + 80 - y.a) > a.m - y.a) {
                    a.d = a.m - y.a;
                }
                if (a.e > a.j - 80 && (a.e = a.j - 80) < 0) {
                    a.e = 0;
                }
                if (a.e + y.b >= a.j + 80 || (a.e = a.j + 80 - y.b) <= a.n - y.b) break;
                a.e = a.n - y.b;
                break;
            }
            case 2: {
                a.d = a.i - (y.a >> 1);
                a.e = a.j - (y.b >> 1);
                if (a.d < 0) {
                    a.d = 0;
                }
                if (a.d > a.m - y.a) {
                    a.d = a.m - y.a;
                }
                if (a.e < 0) {
                    a.e = 0;
                }
                if (a.e <= a.n - y.b) break;
                a.e = a.n - y.b;
                break;
            }
            case 1: {
                var0 = false;
                if ((a.bY += 4) > a.h) {
                    a.bY = a.h;
                }
                if (!a.a()) ** GOTO lbl41
                if (a.d < 0) {
                    a.d = 0;
                    var0 = true;
                }
                if (a.d > a.m - y.a) {
                    a.d = a.m - y.a;
                    var0 = true;
                }
                if (a.e < 0) {
                    a.e = 0;
                    var0 = true;
                }
                if (a.e <= a.n - y.b) ** GOTO lbl50
                a.e = a.n - y.b;
                ** GOTO lbl49
lbl41:
                // 1 sources

                if (a.d < 0) {
                    a.d = 0;
                }
                if (a.d > a.m - y.a) {
                    a.d = a.m - y.a;
                }
                if (a.e < 0) {
                    a.e = 0;
                }
                if (a.e > a.n - y.b) {
                    a.e = a.n - y.b;
                }
lbl49:
                // 4 sources

                var0 = true;
lbl50:
                // 2 sources

                a.i = a.d + a.bZ;
                a.j = a.e + a.ca;
                if (!var0) break;
                a.d(2);
                break;
            }
            case 3: {
                var0_1 = a.a(a.k);
                if (var0_1 == null) break;
                if ((a.bY += 4) > a.h) {
                    a.bY = a.h;
                }
                var1_3 = 0;
                if (y.b() == 7 && y.e != null && y.d()) {
                    var1_3 = 40;
                }
                a.bW = var0_1.a == 1 && var0_1 == y.a && y.i == false && ai.a(var0_1.a[15]) != false ? (var0_1.e >> 16) - (y.a >> 1) + var0_1.a[5] * k.bD : (var0_1.e >> 16) - (y.a >> 1);
                a.bX = (var0_1.f >> 16) - (y.b >> 1) - var1_3;
                a.bZ = a.i - a.d;
                a.ca = a.j - a.e;
                if (a.bW < 0) {
                    a.bW = 0;
                }
                if (a.bW > a.m - y.a) {
                    a.bW = a.m - y.a;
                }
                if (a.bX < 0) {
                    a.bX = 0;
                }
                if (a.bX > a.n - y.b) {
                    a.bX = a.n - y.b;
                }
                a.a();
                a.i = a.d + a.bZ;
                a.j = a.e + a.ca;
            }
        }
        if (a.m) {
            if (a.cd >= a.ce) {
                a.m = false;
                a.cd = 0;
                a.ce = 0;
            }
            var0_2 = (y.e(a.cf) + 2) * (a.cd % 2 == 1 ? 1 : -1);
            var1_3 = (y.e(a.cg) + 2) * (a.cd % 2 == 1 ? 1 : -1);
            a.d += var0_2;
            a.e += var1_3;
            ++a.cd;
        }
    }

    private static boolean a() {
        int n2 = bW - d;
        int n3 = bX - e;
        int n4 = Math.abs(n2);
        int n5 = Math.abs(n3);
        int n6 = n4 + n5;
        h = false;
        if (n6 <= 0) {
            d = bW;
            e = bX;
            h = true;
            return false;
        }
        if (n6 <= bY) {
            d = bW;
            e = bX;
            h = false;
            return true;
        }
        n6 = n4 > n5 ? n4 : n5;
        n2 = (n2 * bY << 6) / n6;
        n3 = (n3 * bY << 6) / n6;
        if (g != 0 && (n4 = Math.abs(n2) + Math.abs(n3)) > g) {
            n2 = (n2 * g << 6) / n4;
            n3 = (n3 * g << 6) / n4;
        }
        d = (d << 6) + n2 >> 6;
        e = (e << 6) + n3 >> 6;
        return true;
    }

    private static void y() {
        int n2;
        int n3 = d / 64;
        if (n3 > ci - bR) {
            n3 = ci - bR;
        }
        if (a == null) {
            a = new int[bS][bR][4096];
            for (n2 = 0; n2 < bS; ++n2) {
                for (int i2 = 0; i2 < bR; ++i2) {
                    System.arraycopy(a.a(n3 + n2 * ci + i2), 0, a[n2][i2], 0, 4096);
                }
            }
            cm = n3;
            cn = 0;
        }
        if (n3 == cm) {
            return;
        }
        if (n3 < cm) {
            if (--cn < 0) {
                cn = bR - 1;
            }
            for (n2 = 0; n2 < bS; ++n2) {
                System.arraycopy(a.a(n3 + n2 * ci), 0, a[n2][cn], 0, 4096);
            }
        } else {
            if (cn >= bR) {
                cn = 0;
            }
            ++cn;
            for (n2 = 0; n2 < bS; ++n2) {
                System.arraycopy(a.a(n3 + bR + n2 * ci - 1), 0, a[n2][cn - 1], 0, 4096);
            }
        }
        cm = n3;
    }

    private static void i(int n2) {
        int n3;
        if (n2 < 0 || n2 > ck) {
            return;
        }
        if (p[n2] == 8) {
            a.p[n2] = 16;
        }
        if (a != null && (n3 = n2 % ci) >= cm && n3 < cm + bR) {
            System.arraycopy(a.a(n2), 0, a[n2 / ci][(n2 % ci - cm + cn) % bR], 0, 4096);
        }
    }

    private static int[] a(int n2) {
        y.a(i, 0);
        int n3 = n2 % ci;
        int n4 = n2 / ci;
        if (n3 < cl / 2 || n3 >= 15 + cl / 2) {
            return i;
        }
        if (n4 < C / 64 || n4 >= 6 + C / 64) {
            return i;
        }
        n3 = (n4 - C / 64) * 15 + (n3 - cl / 2);
        if (p[n2] == 32) {
            return i;
        }
        n4 = 0;
        int n5 = n2 % ci << 6;
        int n6 = n2 / ci << 6;
        for (int i2 = 0; i2 < 64; ++i2) {
            for (int i3 = 0; i3 < 64; ++i3) {
                int n7 = a.b(n5 + i2, n6 + i3);
                int n8 = i2 + (i3 << 6);
                if (n7 < 4) {
                    a.i[n8] = 0;
                    continue;
                }
                a.i[n8] = 0xFF000000 | y.a(a[n3][n8]) & 0xFFFFFF;
                ++n4;
            }
        }
        if (n4 == 0) {
            a.p[n2] = 32;
        }
        return i;
    }

    private static int a(int n2) {
        int n3 = n2 % ci % 2;
        n2 = n2 / ci % 2;
        return n3 + (n2 << 1);
    }

    private static int[] a(int n2, int n3) {
        int[] nArray = new int[4];
        int n4 = (int)((long)n2 * (long)n2 >> 16);
        int n5 = (int)((long)n2 * (long)n4 >> 16);
        nArray[0] = -n5 + n4 * 3 - n2 * 3 + 65536;
        nArray[1] = n5 * 3 - n4 * 6 + 262144;
        nArray[2] = n5 * -3 + n4 * 3 + n2 * 3 + 65536;
        nArray[3] = n5;
        int[] nArray2 = new int[2];
        for (n4 = 0; n4 < 2; ++n4) {
            nArray2[n4] = ((int)((long)nArray[0] * (long)a[n3][n4] >> 16) + (int)((long)nArray[1] * (long)a[n3 + 1][n4] >> 16) + (int)((long)nArray[2] * (long)a[n3 + 2][n4] >> 16) + (int)((long)nArray[3] * (long)a[n3 + 3][n4] >> 16)) / 6;
        }
        return nArray2;
    }

    static void h() {
        int n2 = 0xC00000;
        int n3 = 0xC00000;
        y = cp;
        for (int i2 = 0; i2 < cp; ++i2) {
            ai ai2 = a.a(200, a);
            ai2.c();
            if (i2 == 0) {
                x = ai2.b;
            }
            ai2.a = new short[20];
            ai2.a = new int[20];
            ai2.a = new byte[10];
            ai2.e = a[i2][0] + n2;
            ai2.f = a[i2][1] + n3;
        }
        ai.k();
    }

    private static void z() {
        int n2 = 0;
        int n3 = 0;
        boolean bl = true;
        for (int i2 = 0; i2 < cp - 4; ++i2) {
            for (int i3 = 0; i3 < 65536; i3 += 13107) {
                int[] nArray;
                if (bl) {
                    bl = false;
                    nArray = a.a(i3, i2);
                } else {
                    int n4;
                    int n5;
                    int n6;
                    nArray = a.a(i3, i2);
                    int n7 = nArray[1] >> 8;
                    int n8 = nArray[0] >> 8;
                    n3 >>= 8;
                    if ((n2 >>= 8) > n8) {
                        n6 = n2;
                        n2 = n8;
                        n8 = n6;
                        n6 = n3;
                        n3 = n7;
                        n7 = n6;
                    }
                    if ((n2 = (n5 = n2) + 128 - 1 >> 8) != (n8 = (n4 = n8) + 128 - 1 >> 8)) {
                        n6 = n4 - n5;
                        int n9 = ((n7 <<= 8) - (n3 <<= 8)) / n6;
                        n6 = (n2 << 8) + 128 - n5;
                        n3 += n9 * n6;
                        n6 = (n8 << 8) + 128 - n4;
                        n7 += n9 * n6;
                        n6 = n8 - n2;
                        n9 = (n7 - (n3 += 32768)) / n6;
                        while (n6-- > 0) {
                            int n10 = n2++;
                            n7 = n3 >> 16;
                            n8 = n10;
                            if (n7 < 0) {
                                n7 = 0;
                            }
                            a.a(n8, n7, (byte)(a.b(n8, n7) ^ 1));
                            n3 += n9;
                        }
                    }
                }
                n2 = nArray[0];
                n3 = nArray[1];
            }
        }
    }

    static void e(int n2) {
        int n3 = 0;
        for (int i2 = n2 << 6; i2 < n2 + 1 << 6; ++i2) {
            int n4 = 0;
            int n5 = 0;
            for (int i3 = 0; i3 < cx; ++i3) {
                byte by = (byte)(n4 ^ a.b(i2, i3));
                n4 = by;
                if (by == 0 && n5 == 1) {
                    for (int i4 = 0; 0 - i4 * cw > 0 && i4 < 15; ++i4) {
                        a.q[0 - i4 * a.cw] = 2;
                    }
                }
                if (n4 != 0) {
                    if (n5 != n4) {
                        n5 = 2;
                        n3 = 15;
                    } else {
                        n5 = -1;
                    }
                    if (n3 > 0) {
                        n5 = n3 > 14 ? 2 : (n3 > 13 ? 3 : (n3 > 6 ? 4 : (n3 > 3 ? 5 : (n3 > 2 ? 6 : 7))));
                        n3 = (byte)(n3 - 1);
                    }
                    a.a(i2, i3, (byte)n5);
                }
                n5 = n4;
            }
        }
    }

    static int a() {
        cq = cq * 1664525 + 1013904223;
        return cq;
    }

    static int a(int n2, int n3) {
        return n2 + Math.abs(a.a()) % (n3 - n2);
    }

    private static void b(int n2, int n3) {
        int n4;
        cp = 0;
        for (n4 = 0; n4 < 3; ++n4) {
            a.a[a.cp][0] = c[0][0];
            a.a[a.cp][1] = c[0][1];
            ++cp;
        }
        int n5 = 0;
        n4 = 1;
        while (n4 < co) {
            a.a(c[n5][0], c[n5][1], c[n4][0], c[n4][1], true, 1);
            n5 = n4++;
        }
        n5 = 0;
        n4 = 1;
        while (n4 < co) {
            a.a(c[n5][0], c[n5][1], c[n4][0], c[n4][1], n3, a.a(), n2);
            n5 = n4++;
        }
        for (n4 = 0; n4 < 4; ++n4) {
            a.a[a.cp][0] = c[co - 1][0];
            a.a[a.cp][1] = c[co - 1][1];
            ++cp;
        }
        y.a(q, (byte)0);
        a.z();
    }

    static int a(int n2, int n3, int n4, int n5, boolean n6, int n7) {
        if (Math.abs((n4 >>= 8) - (n2 >>= 8)) >= Math.abs((n5 >>= 8) - (n3 >>= 8))) {
            int n8;
            int n9 = 0;
            int n10 = n2;
            int n11 = n4;
            if ((n2 = n2 + 128 - 1 >> 8) == (n4 = n4 + 128 - 1 >> 8)) {
                n8 = 0;
            } else {
                int n12 = n11 - n10;
                int n13 = ((n5 <<= 8) - (n3 <<= 8)) / n12;
                n10 = (n2 << 8) + 128 - n10;
                n3 += n13 * n10;
                n10 = (n4 << 8) + 128 - n11;
                n5 += n13 * n10;
                n12 = n4 - n2;
                n13 = n5 - n3;
                n4 = Math.abs(n12);
                n5 = n12 < 0 ? -1 : 1;
                n3 += 32768;
                n13 /= n4;
                if (n6 != 0) {
                    while (n4-- > 0) {
                        a.a(n2, n3 >> 16, (byte)n7);
                        n2 += n5;
                        n3 += n13;
                    }
                    n8 = 0;
                } else {
                    int n14 = 0;
                    while (n4-- > 0) {
                        n7 = n14;
                        n6 = n3 >> 16;
                        n14 += a.b(n2, n6) == 0 ? 0 : 1;
                        if ((n3 += n13) >> 16 != n6) {
                            n14 += a.b(n2, n3 >> 16) == 0 ? 0 : 1;
                        }
                        if (n14 != n7) {
                            cy = n2 << 16;
                            cz = n3;
                            if (++n9 == 1) {
                                o = cy;
                                p = cz;
                            }
                        }
                        n2 += n5;
                    }
                    n8 = n14;
                }
            }
            n2 = n8;
        } else {
            int n15;
            int n16 = 0;
            int n17 = n3;
            int n18 = n5;
            if ((n3 = n3 + 128 - 1 >> 8) == (n5 = n5 + 128 - 1 >> 8)) {
                n15 = 0;
            } else {
                int n19 = n18 - n17;
                int n20 = ((n4 <<= 8) - (n2 <<= 8)) / n19;
                n17 = (n3 << 8) + 128 - n17;
                n2 += n20 * n17;
                n17 = (n5 << 8) + 128 - n18;
                n20 = n4 + n20 * n17 - n2;
                n19 = n5 - n3;
                n4 = Math.abs(n19);
                n5 = n19 < 0 ? -1 : 1;
                n2 += 32768;
                n20 /= n4;
                if (n6 != 0) {
                    while (n4-- > 0) {
                        a.a(n2 >> 16, n3, (byte)n7);
                        n3 += n5;
                        n2 += n20;
                    }
                    n15 = 0;
                } else {
                    int n21 = 0;
                    while (n4-- > 0) {
                        n7 = n21;
                        n6 = n2 >> 16;
                        n21 += a.b(n6, n3) == 0 ? 0 : 1;
                        if ((n2 += n20) >> 16 != n6) {
                            n21 += a.b(n2 >> 16, n3) == 0 ? 0 : 1;
                        }
                        if (n21 != n7) {
                            cy = n2;
                            cz = n3 << 16;
                            if (++n16 == 1) {
                                o = cy;
                                p = cz;
                            }
                        }
                        n3 += n5;
                    }
                    n15 = n21;
                }
            }
            n2 = n15;
        }
        return n2;
    }

    private static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        while (true) {
            y.m[0] = n4 - n2;
            y.m[1] = n5 - n3;
            int n9 = y.a(y.m);
            if (n9 >> 16 < n6) break;
            a.a(n2, n3, n4, n5, true, 0);
            int n10 = n2 + n4 >> 1;
            int n11 = n3 + n5 >> 1;
            if (n10 >> 16 >= 16 && n11 >> 16 >= 16 && n10 >> 16 < cw - 16 && n11 >> 16 < cx - 16) {
                int n12 = y.c(n9 / cw, 65536);
                int n13 = (int)((long)(cs + (int)((long)(ct - cs) * (long)n12 >> 16)) * (long)n9 >> 16);
                n12 = y.m[0];
                n9 = y.m[1];
                if ((n10 -= (int)((long)((int)((long)n9 * (long)(n13 = (int)((long)((n7 & 0xFFFF) - 32768) * (long)n13 >> 16)) >> 16)) * (long)cu >> 16)) >> 16 < 16 || (n11 += (int)((long)((int)((long)n12 * (long)n13 >> 16)) * (long)cv >> 16)) >> 16 < 16 || n10 >> 16 >= cw - 16 || n11 >> 16 >= cx - 16 || a.a(n2, n3, n10, n11, false, 0) != 0 || a.a(n10, n11, n4, n5, false, 0) != 0) {
                    n10 = n2 + n4 >> 1;
                    n11 = n3 + n5 >> 1;
                }
            }
            a.a(n2, n3, n10, n11, true, 1);
            a.a(n10, n11, n4, n5, true, 1);
            a.a(n2, n3, n10, n11, n6, (int)((long)(n7 * 1664525) + 1013904223L), n8);
            n7 = (int)((long)(n7 * 1164525) + 1013904223L + 2000000000L);
            n3 = n11;
            n2 = n10;
        }
        a.a[a.cp][0] = n2;
        a.a[a.cp][1] = n8 == 1 ? (n3 >> 16 < k.bC ? n3 + (k.bA << 16) : (n3 >> 16 < k.bA && n3 >> 16 >= k.bC ? n3 + (k.bB << 16) : n3)) : n3;
        ++cp;
    }

    static void a(int n2, int n3, int n4) {
        int n5;
        if (l) {
            return;
        }
        byte[] byArray = new byte[4 * (n4 + 1) * (n4 + 1)];
        int n6 = n4;
        byte[] byArray2 = byArray;
        int n7 = 1 - n4;
        int n8 = 1;
        int n9 = n4 * -2;
        int n10 = 0;
        int n11 = n4;
        int n12 = (n4 << 1) + 1;
        byArray2[n6 + (n11 + n4) * n12] = 1;
        byArray2[n6 + 0] = 1;
        byArray2[n6 + n4 + n11 * n12] = 1;
        byArray2[0 + n11 * n12] = 1;
        int n13 = n11 * n12;
        for (n5 = 0; n5 <= n6 + n4; ++n5) {
            byArray2[n5 + n13] = 1;
        }
        while (n10 < n11) {
            if (n7 >= 0) {
                --n11;
                n7 += (n9 += 2);
            }
            n7 += (n8 += 2);
            n13 = (n6 + n11) * n12;
            for (n5 = n4 - ++n10; n5 <= n4 + n10; ++n5) {
                byArray2[n5 + n13] = 1;
            }
            n13 = (n6 - n11) * n12;
            for (n5 = n4 - n10; n5 <= n4 + n10; ++n5) {
                byArray2[n5 + n13] = 1;
            }
            n13 = (n6 + n10) * n12;
            for (n5 = n4 - n11; n5 <= n4 + n11; ++n5) {
                byArray2[n5 + n13] = 1;
            }
            n13 = (n6 - n10) * n12;
            for (n5 = n4 - n11; n5 <= n4 + n11; ++n5) {
                byArray2[n5 + n13] = 1;
            }
        }
        n8 = n4 << 1;
        n7 = n3 - n4;
        n6 = n2 - n4;
        byArray2 = byArray;
        for (n2 = 0; n2 < n8; ++n2) {
            for (n12 = 0; n12 < n8; ++n12) {
                if (byArray2[n2 + n12 * (n8 + 1)] == 0) continue;
                a.a(n6 + n2, n7 + n12, (byte)0);
                n5 = (n6 + n2 - B) * 170 / (m - 2 * B);
                n13 = (n7 + n12 - C) * (59 - y.ch) / (n - C - D);
                if (n5 < 0 || n5 >= 170 || n13 < 0 + y.ch || n13 >= 59) continue;
                n10 = n13 * 170 + n5;
                y.t[n10] = 0;
            }
        }
        n12 = n6 / 64 << 6;
        n5 = n7 / 64 << 6;
        for (n11 = n12; n11 < n6 + n8; n11 += 64) {
            for (n3 = n5; n3 < n7 + n8; n3 += 64) {
                n2 = n11 / 64 + n3 / 64 * ci;
                if (n2 < 0 || n2 >= ci * (cj - D / 64)) continue;
                a.i(n2);
            }
        }
        for (int i2 = q; i2 < q + r; ++i2) {
            if (a[i2] != 1 || a.a[i2].a != 1) continue;
            a.a[i2].d |= 0x400;
        }
    }

    static void i() {
        if (a == null) {
            a = new ai[250];
            a = new byte[250];
            for (int i2 = 0; i2 < 250; ++i2) {
                a.a[i2] = new ai(i2);
            }
            a = new ai[7][250];
            j = new int[7];
        }
        a.j();
    }

    static void j() {
        for (int i2 = 0; i2 < 250; ++i2) {
            if (a[i2] == null) continue;
            a[i2].a();
            a.a[i2] = 0;
        }
        A = 0;
        a = null;
    }

    static void b(o o2) {
        int n2;
        int n3;
        ac.a(o2);
        for (n3 = 0; n3 < j[0]; ++n3) {
            a[0][n3].a(o2);
        }
        if (y.b() == 7 || y.b() == 18 || y.b() == 19) {
            int n4 = e;
            int n5 = d;
            int n6 = y.b;
            n2 = y.a;
            n3 = n5 / 64;
            int n7 = n4 / 64;
            int n8 = n3 + n7 * ci;
            n3 = (n3 << 6) - n5;
            n5 = (n7 << 6) - n4;
            while (n5 < n6) {
                n4 = n8;
                n7 = n3;
                while (n7 < n2) {
                    int n9;
                    int n10 = n5;
                    int n11 = n7;
                    int n12 = n4;
                    if (n12 >= 0 && n12 < ck && (p[n12] & 0x20) == 0 && (n9 = a.a(n12)) >= 0 && n9 < y.a[a.l].b) {
                        if ((p[n12] & 8) != 0) {
                            ac.a = 0;
                            y.a[l].a(n9, n11, n10, 0);
                        } else if ((p[n12] & 0x20) == 0) {
                            ac.a = 2;
                            int n13 = (n12 % ci - cm + cn) % bR;
                            ac.g = a[n12 /= ci][n13];
                            y.a[l].b(n9, n11, n10, 0);
                        }
                    }
                    n7 += 64;
                    ++n4;
                }
                n5 += 64;
                n8 += ci;
            }
            ac.a = 0;
        }
        o2.e(0, 0, k.F, k.G);
        if (y.d != null && (y.d.d & 0x18) == 0) {
            y.a(o2, y.cp);
            if (y.co >= 12) {
                ai.a(y.d.e, y.d.f, y.d.A, y.cn);
            }
        }
        for (n3 = 1; n3 < 6; ++n3) {
            for (n2 = 0; n2 < j[n3]; ++n2) {
                a[n3][n2].a(o2);
            }
        }
        for (n3 = 0; n3 < j[6]; ++n3) {
            a[6][n3].a(o2);
        }
        if (y.a != null && y.a.a == 3 && (y.a.a[15] == 1 || y.a.a[15] == 7 || y.a.a[15] == 19 || y.a.a[15] == 25)) {
            n3 = 0 + (y.a.e >> 16) - d;
            n2 = 0 + (y.a.f >> 16) - e;
            y.a(y.a.a[15], n3, n2 + -50);
        }
        if (y.b() == 7 || y.b() == 18 || y.b() == 19) {
            y.b(o2);
        }
    }

    static void k() {
        for (int i2 = 0; i2 < A; ++i2) {
            if (a[i2] != 1) continue;
            a[i2].d();
        }
    }

    static void f(int n2) {
        try {
            b b2 = null;
            try {
                b2 = new b(n2);
                while (b2.available() > 0) {
                    n2 = b2.read() & 0xFF;
                    if (n2 >= 60 && n2 <= 65) {
                        s s2;
                        if (cA >= 250) {
                            s2 = null;
                        } else {
                            s s3 = a[cA++];
                            a[cA++].a = (byte)n2;
                            s3.a();
                            s2 = s3;
                        }
                        s2.a(b2);
                        continue;
                    }
                    if (n2 >= 80 && n2 <= 96) {
                        s s4;
                        if (cB >= 250) {
                            s4 = null;
                        } else {
                            s s5 = b[cB++];
                            b[cB++].a = (byte)n2;
                            s5.a();
                            s4 = s5;
                        }
                        s4.a(b2);
                        continue;
                    }
                    if (n2 != 0) {
                        ai ai2 = y.a(n2) ? a.a(n2, y.a) : a.a(n2, a);
                        ai2.a(b2, n2);
                        if (n2 != 1) continue;
                        if (q == -1) {
                            q = ai2.b;
                        }
                        ++r;
                        if (y.d()) continue;
                        ai2.d |= 0x10;
                        continue;
                    }
                    b b3 = b2;
                    b3.a();
                    int n3 = b3.read() & 0xFF;
                    b3.read();
                    int n4 = b3.read() & 0xFF;
                    short s6 = b3.a();
                    n2 = b3.a();
                    a.a(s6 + B, n2 + C, n3, n4 != 0);
                }
            }
            catch (Exception exception) {}
            b2.close();
            b.a();
            System.gc();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static ai d(int n2) {
        for (int i2 = 0; i2 < A; ++i2) {
            if (a.a[i2].c != n2) continue;
            return a[i2];
        }
        return null;
    }

    static ai a(int n2) {
        if (n2 < 0) {
            return null;
        }
        if (a[n2 &= 0xFFFF] == 1) {
            return a[n2];
        }
        return null;
    }

    static void g(int n2) {
        ai ai2 = a[n2];
        if (ai2.a == 12 || ai2.a == 9 || ai2.a == 1) {
            a.a(ai2);
        }
        if (ai2.a == 19 && ai2.r == 1) {
            a.a(ai2);
        }
        if (ai2.a != 1) {
            a.a[n2] = 0;
        }
        if (ai2.a == 19) {
            ai2.d &= 0xFFFFFFDF;
        }
        for (n2 = A - 1; n2 >= 0 && a[n2] != 1; --n2) {
        }
        A = n2 + 1;
        ai2.d |= 0x18;
    }

    private static void j(int n2) {
        a.a[n2] = 1;
        a.a[n2].d &= 0xFFFFFFE7;
        if (a.a[n2].a == 19) {
            a[n2].a(1);
            a.a[n2].s = -1;
            a[n2].b((int)a.a[n2].a[1]);
            a[n2].c();
            a[n2].a(1);
            a[n2].b(69);
            a.a[n2].d |= 0x40;
        }
    }

    static ai b(int n2) {
        return a.a(n2, a);
    }

    private static ai a(int n2, ai[] object) {
        int n3 = 0;
        if (object == a) {
            int n4;
            block7: {
                for (int i2 = 0; i2 < 250; ++i2) {
                    if (a[i2] != 0) continue;
                    n4 = i2;
                    break block7;
                }
                n4 = n3 = -1;
            }
            if (n4 < 0) {
                return null;
            }
            object = a[n3];
            a.a[n3] = 1;
            if (n2 == 19) {
                ++w;
            }
            if (n3 >= A) {
                A = n3 + 1;
            }
        } else {
            object = y.a[y.w++];
        }
        ((ai)object).a();
        ((ai)object).a = n2;
        ((ai)object).b = n3;
        if (((ai)object).a != 23) {
            ((ai)object).b();
        }
        return object;
    }

    static void a(int n2, int n3, int n4, int n5) {
        for (n2 = 0; n2 < 50; ++n2) {
            int n6;
            ai ai2 = a.a(6, a);
            a.a(6, a).e = y.e(n4);
            ai2.f = y.e(n5);
            switch (n3) {
                case 45: 
                case 48: {
                    n6 = 0;
                    break;
                }
                case 44: 
                case 47: {
                    n6 = 4;
                    break;
                }
                case 46: {
                    n6 = 2;
                    break;
                }
                default: {
                    n6 = 4;
                }
            }
            if (y.e(101) < 50) {
                ai2.g = 0;
            }
            if (y.e(2) == 1) {
                ++n6;
            }
            ai2.b(n6);
        }
    }

    static ai a(short s2, byte by, byte by2, byte by3) {
        ai ai2 = a.a(17, a);
        if (ai2 == null) {
            return null;
        }
        ai2.a(17, ai2.e, ai2.e);
        ai2.a[0] = s2;
        ai2.a[0] = by;
        ai2.a[1] = by2;
        ai2.a[2] = 1;
        ai2.a = 0L;
        return ai2;
    }

    static void l() {
        int n2 = (y.cc >= 0 ? 1 : -1) * (0 + (int)((long)Math.abs(y.cc) * 917504L >> 16));
        for (int i2 = 0; i2 < A; ++i2) {
            if (a[i2] != 1 || a.a[i2].a != 6) continue;
            int n3 = 0;
            if (n2 != 0) {
                n3 = y.e(196608);
            }
            a.a[i2].A = n2 + (n2 >= 0 ? 1 : -1) * n3;
            a.a[i2].B = 98304;
        }
    }

    static ai a() {
        ai ai2 = a.a(9, a);
        a.a(9, a).r = 12;
        ai2.b(2);
        ai2.c();
        ai2.d |= 0x40;
        ai2.d |= 0x20;
        ai2.e = 0;
        int n2 = 0;
        while (n2 == 0) {
            int n3 = a.a(292, 1052);
            int n4 = a.a(192, 576);
            ai2.e = n3 << 16;
            ai2.f = n4 << 16;
            if (!ai2.a(a, ai2.e, ai2.f)) continue;
            n2 = 1;
            ai2.f = 0x320000;
        }
        a.c(ai2.b);
        ai2.r = 12;
        ai2.d |= 0x40;
        ai2.d |= 0x20;
        if (y.B != 4 && y.B != 3 && y.e(100) < 25) {
            ai2.a[0] = -1;
            ai2.b(3);
        } else if (y.B == 5) {
            if (!g) {
                g = true;
                ai2.a[0] = 24;
                ai2.b(2);
            } else {
                ai2.a[0] = -1;
                ai2.b(3);
            }
        } else {
            n2 = y.cv;
            ai2.a[0] = y.y[y.e(n2)];
            ai2.b(2);
        }
        return ai2;
    }

    private static void c(int n2, int n3) {
        for (int i2 = 0; i2 < 3; ++i2) {
            ai ai2 = a.a(n3, a);
            ai2.c();
            n2 = 0;
            int n4 = 0;
            while (n2 == 0 && n4 < 40) {
                int n5 = y.b(B, 960 + B);
                int n6 = y.b(C, 384 + C);
                ai2.e = n5 << 16;
                ai2.f = n6 << 16;
                if (!ai2.a(a, n5 << 16, n6 << 16)) {
                    if ((n6 = ai2.a(n5, n6, false)) < b) {
                        n2 = 1;
                    }
                } else {
                    if (n3 == 13 || n3 == 12) {
                        n2 = 0;
                        continue;
                    }
                    if ((n6 = ai2.a(n5, n6, true)) > 0x180000 && n6 < b) {
                        n2 = 1;
                    }
                }
                ai2.a(n5 << 16, n6 << 16);
                if (n2 != 0 && n3 == 13 && ai2.d()) {
                    n2 = 0;
                }
                if (n2 != 0) {
                    n5 = -1;
                    n6 = -1;
                    if (n3 == 12 && s != -1) {
                        n5 = s;
                        n6 = s + t - 1;
                    } else if (n3 == 13 && u != -1) {
                        n5 = u;
                        n6 = u + v - 1;
                    }
                    if (n5 != -1) {
                        n2 = a.a(ai2, n5, n6, 30) ? 1 : 0;
                    }
                    if (n3 == 13 && n2 != 0 && s != -1) {
                        n2 = a.a(ai2, s, s + t, 6) ? 1 : 0;
                    }
                }
                if (n2 != 0 && n3 == 12) {
                    for (n5 = q; n5 < q + r; ++n5) {
                        if (a[n5] != 1 || a.a[n5].a != 1 || a[n5].b() || !ai2.a(a[n5], ai2.e, ai2.f)) continue;
                        n2 = 0;
                        break;
                    }
                }
                ++n4;
            }
            if (n2 == 0) {
                --t;
                if (s == ai2.b) {
                    s = -1;
                }
                a.g(ai2.b);
                continue;
            }
            if (n3 == 12) {
                a.a(ai2, (byte)1);
                if (s == -1) {
                    s = ai2.b;
                }
                ++t;
            }
            if (n3 != 13) continue;
            if (u == -1) {
                u = ai2.b;
            }
            ++v;
        }
    }

    private static boolean a(ai ai2, int n2, int n3, int n4) {
        if (n2 < 0) {
            n2 = 0;
        }
        while (n2 < n3) {
            if ((Math.abs((a.a[n2].e >> 16) - (ai2.e >> 16)) > Math.abs((a.a[n2].f >> 16) - (ai2.f >> 16)) ? Math.abs((a.a[n2].e >> 16) - (ai2.e >> 16)) : Math.abs((a.a[n2].f >> 16) - (ai2.f >> 16))) < n4) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    static ai a(byte by, int n2, int n3) {
        ai ai2 = a.a(10, a);
        ai2.a(10, n2 + 25 << 16, n3 + -34 << 16);
        ai2.a[0] = by;
        return ai2;
    }

    public static int b() {
        int n2 = y.p[y.bX];
        do {
            if (++n2 < q) {
                n2 = q;
            }
            if (n2 <= q + r - 1) continue;
            n2 = q;
        } while (a.a[n2].a != 1 || a[n2].b() || a.a[n2].a[3] != y.bX || (a.a[n2].d & 0x18) != 0);
        return n2;
    }

    static void b(int n2, int n3, int n4, int n5) {
        n3 <<= 16;
        int n6 = y.c[n2][0];
        int n7 = y.c[n2][1];
        for (int i2 = 0; i2 < A; ++i2) {
            int n8;
            int n9;
            if (a[i2] != 1) continue;
            ai ai2 = a[i2];
            if (ai2.a != 1 && ai2.a != 12 && ai2.a != 13 && ai2.a != 9 && ai2.a != 14 && ai2.a != 19 && ai2.a != 27 || n3 == 0 || n2 == 8 && ai2.a == 1 && (ai2.a == 20 || ai2 == y.a) || n2 == 31 && ai2 == y.a || n2 == 28 && ai2 == y.a && ai2.a == 24 && ai2.a[15] == 32 || (n2 == 16 || n2 == 12) && ai2.a == 1 && ai2 == y.a || n2 == 19 && ai2.a == 1 && ai2.a == 24 || n2 == 8 && ai2.a == 1 && ai2.a[13] == 1) continue;
            if (n2 == 34 && ai2.a == 1) {
                y.h();
                y.h(-1);
            }
            y.m[0] = ai2.e - n4;
            y.m[1] = ai2.c() - n5;
            if (n2 == 31 || n2 == 2) {
                y.m[0] = y.a.a[5] * Math.abs(ai2.e - n4);
            }
            if ((n9 = y.a(y.m)) > n3 || (n8 = n2 == 31 ? 0x1E0000 : (n6 << 16) + (int)((long)(n7 - n6 << 16) * (long)((int)(((long)n3 - (long)n9 << 16) / (long)n3)) >> 16)) >> 16 == 0) continue;
            if (n2 == 2 && ai2.a == 1) {
                if (ai2.a == 18 || ai2.b) continue;
                ai2.b = true;
            }
            n9 = (int)((long)y.m[0] * (long)n8 >> 16) / 3;
            int n10 = (int)((long)y.m[1] * (long)n8 >> 16) / 3;
            if (n2 == 16 && ai2.a == 1) {
                n9 = y.a.a[5] * 180 >> 16;
                n10 = y.d(n9);
                int n11 = y.c(n9);
                n9 = y.a.a[5] * (int)(983040L * (long)n10 >> 16);
                n10 = (int)(983040L * (long)n11 >> 16);
                ai2.a[17] = 1;
            }
            if (n2 == 12) {
                n9 = 0;
                n10 = 0;
            }
            if (n2 == 23) {
                n10 = -131072;
            }
            if (n2 == 2) {
                n9 = 131072 * (y.m[0] > 0 ? 1 : -1);
                n10 = -786432;
            }
            n9 = (int)((long)n9 << 16 >> 16);
            n10 = (int)((long)n10 << 16 >> 16);
            if (y.d()) {
                n9 = 0;
                n10 = 0;
            }
            ai2.b(n9, n10);
            if (ai2.a == 1) {
                ai2.b((byte)11);
            }
            ai2.a(n2, n8 >> 16);
        }
    }

    static int a(int n2, int n3, int n4) {
        n4 = 0;
        int n5 = 0;
        int n6 = -1;
        for (int i2 = 0; i2 < A; ++i2) {
            if (a[i2] != 1 || a.a[i2].a != 1) continue;
            int n7 = Math.abs(a.a[i2].e - n2) + Math.abs(a.a[i2].f - n3);
            if (n4 != 0 && n7 >= n5) continue;
            n5 = n7;
            n4 = 1;
            n6 = i2;
        }
        return n6;
    }

    static void m() {
        for (int i2 = 0; i2 < A; ++i2) {
            if (a.a[i2].a != 5 || a.a[i2].r != 5 || a.a[i2].s != 13 || (long)y.m - a.a[i2].a < 100L) continue;
            a.g(i2);
        }
    }

    static void n() {
        for (int i2 = 0; i2 < A; ++i2) {
            if (a.a[i2].a != 17) continue;
            a.g(i2);
        }
    }

    static void o() {
        if (a == null) {
            return;
        }
        for (int i2 = 0; i2 < 250; ++i2) {
            a.g(i2);
        }
    }

    static ai c(int n2) {
        int n3 = 65536000;
        int n4 = -1;
        for (int i2 = q; i2 < q + r; ++i2) {
            if (i2 == ai.a.b || (a.a[i2].d & 0x10) == 16 || a[i2] != 1 || a.a[i2].a != 1 || a.a[i2].f >= (b << 16) + 0x180000 || a.a[i2].f >= n << 16 || a.a[i2].e <= 192 || a.a[i2].e >= m - 192 << 16 || a.a[i2].e >> 16 <= 192) continue;
            int n5 = a.a[i2].e - ai.a.e;
            if (n2 == 0) {
                if (n5 <= 0 || n5 >= n3) continue;
                n3 = n5;
                n4 = i2;
                continue;
            }
            if (n5 >= 0 || Math.abs(n5) >= Math.abs(n3)) continue;
            n3 = n5;
            n4 = i2;
        }
        if (y.e && n4 == -1) {
            n4 = ai.a.b;
        }
        if (n4 == -1) {
            return null;
        }
        return a[n4];
    }

    static void p() {
        if (y.B == 4 || y.q) {
            return;
        }
        for (int i2 = q; i2 < q + r; ++i2) {
            if (a[i2] != 1 || !a.a[i2].c || a.a[i2].a != 1) continue;
            a.a[i2].a[9] = a.a[i2].a[9] + y.c[12][0];
            if (!a.a[i2].d) continue;
            a.c(a.a[i2].b);
            a[i2].a(1);
            a[i2].b(82);
        }
        y.q = true;
    }

    private static void a(int n2, int n3, byte by) {
        if (n2 >= cw + B || n3 >= cx + C || n2 < B || n3 < C) {
            return;
        }
        n2 = n2 - B + (n3 - C) * cw;
        a.q[n2] = by;
    }

    public static int b(int n2, int n3) {
        if (n2 >= cw + B || n3 >= cx + C || n2 < B || n3 < C) {
            return 0;
        }
        n2 = n2 - B + (n3 - C) * cw;
        return q[n2] & 0xFF;
    }

    static boolean a(int n2, int n3) {
        return 0 == a.b(n2, n3 + 1);
    }

    static void a(ai ai2, byte n2) {
        n2 = (ai2.e >> 16) + ai2.g[0];
        int n3 = (ai2.f >> 16) + ai2.g[1];
        int n4 = ai2.g[2] - ai2.g[0];
        int n5 = ai2.g[3] - ai2.g[1];
        for (int i2 = n2; i2 < n2 + n4; ++i2) {
            for (int i3 = n3; i3 < n3 + n5; ++i3) {
                a.a(i2, i3, (byte)1);
            }
        }
    }

    static void a(ai ai2) {
        int n2 = (ai2.e >> 16) + ai2.g[0];
        int n3 = (ai2.f >> 16) + ai2.g[1];
        int n4 = ai2.g[2] - ai2.g[0];
        int n5 = ai2.g[3] - ai2.g[1];
        for (int i2 = n2; i2 < n2 + n4; ++i2) {
            for (int i3 = n3; i3 < n3 + n5; ++i3) {
                a.a(i2, i3, (byte)0);
            }
        }
    }

    static boolean a(int n2, int n3, int n4, int n5, boolean bl) {
        int n6 = 0;
        if (bl) {
            n6 = 3;
        }
        return a.b(n2, n3) > n6 || a.b(n2 + n4, n3) > n6 || a.b(n2, n3 + n5) > n6 || a.b(n2 + n4 / 2, n3 + n5 / 2) > n6 || a.b(n2 + n4, n3 + n5) > n6;
    }

    static boolean b(int n2, int n3, int n4, int n5, boolean bl) {
        int n6 = 0;
        if (bl) {
            n6 = 1;
        }
        return a.b(n2 - n4, n3 - n5) > n6 || a.b(n2 + n4, n3 - n5) > n6 || a.b(n2, n3) > n6 || a.b(n2 - n4, n3 + n5) > n6 || a.b(n2 + n4, n3 + n5) > n6;
    }

    static void h(int n2) {
        if (E == n2) {
            return;
        }
        E = n2;
    }

    static void q() {
        if (y.e) {
            a = true;
        }
        if (E == 0) {
            return;
        }
        if (y.i && !a) {
            if ((t.a() - (c + b) > d || y.j) && !y.k) {
                y.i = false;
                a.h(0);
                return;
            }
        } else {
            if (a) {
                return;
            }
            a = y.B == 1 && y.A == 2 ? f + 31000L - t.a() + b : f + g - t.a() + b;
            if (a < 6000L && (y.D & 1) == 0) {
                y.l(1);
            }
            if (a <= 0L && (y.p == 2 || y.p == 4 || y.p == 3)) {
                y.c(5);
                if (y.a != null && y.a.a == 2) {
                    y.a.b((byte)1);
                }
            }
        }
    }

    static void r() {
        b = 0L;
        f = t.a();
        a.h(2);
    }

    static void s() {
        b = 0L;
        a.h(1);
    }

    static void t() {
        if (y.a != null && y.a.a[12] == 1) {
            y.i = true;
            c = t.a() - b;
        }
        if (y.a.a[12] == 0) {
            a.h(0);
        }
    }

    static void u() {
        a.h(0);
    }

    static void v() {
        a.h(2);
    }

    static void w() {
        b = t.a() - b;
        a.h(0);
    }

    static void x() {
        if (y.a != null) {
            y.a.a += t.a() - b;
        }
        if (E != 0) {
            return;
        }
        b = t.a() - b;
        a.h(1);
    }

    static void a(ai ai2, int n2, int n3) {
        for (int i2 = 0; i2 < cA; ++i2) {
            if (a.a[i2].a != 60) continue;
            int n4 = n3 >> 16;
            int n5 = n2 >> 16;
            ai ai3 = ai2;
            s s2 = a[i2];
            if (!s2.a || s2.a[5] != -1 && ai3.c != s2.a[5]) continue;
            if (s2.a(ai3.e >> 16, ai3.f >> 16) && !s2.a(n5, n4)) {
                s2.a[2] = (byte)(s2.a[2] + 1);
            }
            if (s2.a[2] < s2.a[1]) continue;
            s2.b();
            s2.a[2] = 0;
        }
    }

    static void a(short s2, ai ai2, boolean bl) {
        block7: for (int i2 = 0; i2 < cA; ++i2) {
            if (a.a[i2].a != s2) continue;
            ai ai3 = ai2;
            s s3 = a[i2];
            if (!s3.a) continue;
            switch (s3.a) {
                case 61: {
                    if (ai3.c != s3.a[5] || !s3.a(ai3.e >> 16, ai3.f >> 16)) continue block7;
                    s3.b();
                    continue block7;
                }
                case 62: {
                    s3.b();
                    continue block7;
                }
                case 63: {
                    if (bl) {
                        if (s3.a[1] != 33) continue block7;
                        s3.b();
                        continue block7;
                    }
                    if (ai3.a[15] != s3.a[1]) continue block7;
                    s3.b();
                    continue block7;
                }
                case 64: {
                    if (w != s3.a[1]) continue block7;
                    s3.b();
                    continue block7;
                }
                case 65: {
                    if (y.cw != s3.a[1]) continue block7;
                    s3.b();
                }
            }
        }
    }

    static s a(int n2) {
        int n3;
        for (n3 = 0; n3 < cA; ++n3) {
            if (a.a[n3].a != n2) continue;
            return a[n3];
        }
        for (n3 = 0; n3 < cB; ++n3) {
            if (a.b[n3].a != n2) continue;
            return b[n3];
        }
        return null;
    }

    static {
        g = new int[24];
        h = new int[]{2436621, 3751995, 5061401, 7616000, 3223343};
        g = false;
        c = -1;
        a = null;
        bV = 0;
        h = false;
        bY = 0;
        g = 0;
        h = 30;
        i = k.F / 2;
        j = k.G / 2;
        k = -1;
        i = false;
        m = false;
        cd = 0;
        ce = 0;
        l = -1;
        ch = -1;
        cl = 0;
        i = new int[4096];
        c = new int[16][2];
        m = 960;
        n = 384;
        cw = 960;
        cx = 384;
        q = -1;
        w = 0;
        y = 0;
        j = true;
        z = -1;
        q = new byte[368640];
        B = 0;
        C = 0;
        D = 0;
        g = 61000L;
        b = 0L;
        k = false;
    }
}

