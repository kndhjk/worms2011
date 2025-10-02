/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class i
implements k {
    static boolean a;
    private static boolean c;
    private static int b;
    private static int c;
    private static int d;
    static int a;
    static boolean b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void a(int n2, int n3, boolean by) {
        int n4;
        c = true;
        b = 0;
        c = n2;
        d = n3;
        if (n3 >= k.G - 35) {
            n4 = -1;
            if (n2 < 100) {
                n4 = 32;
            } else if (n2 > k.F - 100) {
                n4 = 64;
            }
            if (n4 != -1) {
                i.a(n4, by != 0);
                return;
            }
        }
        boolean bl = false;
        if (bl) {
            return;
        }
        switch (y.o) {
            case 4: 
            case 5: {
                int n5 = n2;
                if (y.q == 6) {
                    if (n3 < k.G / 2) {
                        i.a(1, by != 0);
                        return;
                    }
                    i.a(2, by != 0);
                    return;
                }
                if (y.q == 18 || y.q == 25 || y.q == 26 || y.q == 27) {
                    n5 = y.r;
                    int n6 = 0;
                    while (n6 < 6) {
                        int n7 = y.a[n6][0] - n2;
                        n4 = y.a[n6][1] - n3;
                        if ((n7 *= n7) + (n4 *= n4) <= 441) {
                            if (n6 >= 4) {
                                if (!y.a()) return;
                            }
                            y.r = n6;
                            if (n5 != n6) return;
                            i.a(4096, by != 0);
                            return;
                        }
                        ++n6;
                    }
                    return;
                }
                if (y.a == y.b) {
                    if (by != 0) {
                        System.out.println("TOUCH detected X: " + n2 + " Y: " + n3);
                    }
                    if (y.a(n2, n3, k.ac - 42 - 31, k.ae - 44 - 5 - 35, 62, 70)) {
                        if (y.r == 0) {
                            i.a(4096, by != 0);
                            return;
                        }
                        y.r = 0;
                        return;
                    }
                    if (y.a(n2, n3, k.ac + 42 - 31, k.ae - 44 - 5 - 35, 62, 70)) {
                        if (y.r == 1) {
                            i.a(4096, by != 0);
                            return;
                        }
                        y.r = 1;
                        return;
                    }
                    if (y.a(n2, n3, k.ac - 42 - 31, k.ae + 44 - 35, 62, 70)) {
                        if (y.r == 2) {
                            i.a(4096, by != 0);
                            return;
                        }
                        y.r = 2;
                        return;
                    }
                    if (!y.a(n2, n3, k.ac + 42 - 31, k.ae + 44 - 35, 62, 70)) return;
                    if (y.r == 3) {
                        i.a(4096, by != 0);
                        return;
                    }
                    y.r = 3;
                    return;
                }
                n4 = -1;
                int n8 = i.a(y.q);
                int n9 = i.a(y.q) + y.u * y.b(y.q);
                if (y.b() || y.a == y.c) {
                    i.b(n5, n3, by != 0);
                    return;
                }
                if (y.t > y.u || y.s > 0 && y.q != 17) {
                    if (n3 < n8) {
                        n4 = 1;
                    } else if (n3 > n9) {
                        n4 = 2;
                    }
                    if (n4 != -1) {
                        i.a(n4, by != 0);
                        return;
                    }
                }
                n5 = y.b(y.q);
                int n10 = i.a(y.q);
                int n11 = y.c();
                int n12 = y.r;
                int n13 = y.s;
                int n14 = 0;
                while (n13 < n11) {
                    if (n14 >= y.u) return;
                    if (y.q == 15 || (y.a[n13] & 0x2000) == 0) {
                        ++n14;
                        if (y.u < 3) {
                            if (n3 - 25 < n10 + n5 / 2 && n3 - 25 > n10 - n5 / 2) {
                                y.r = n13;
                                if (y.r != n12) return;
                                i.a(4096, by != 0);
                                return;
                            }
                        } else if (n3 < n10 + n5 / 2 && n3 > n10 - n5 / 2) {
                            y.r = n13;
                            if (y.r != n12) return;
                            i.a(4096, by != 0);
                            return;
                        }
                        n10 += n5;
                    }
                    ++n13;
                }
                return;
            }
            case 7: {
                int n15 = n2;
                switch (y.p) {
                    case 14: 
                    case 15: {
                        i.a(4096, by != 0);
                        return;
                    }
                    case 4: {
                        int n16 = n3;
                        n3 = by;
                        n2 = n16;
                        if (!y.o) return;
                        if (y.i) {
                            return;
                        }
                        int n17 = (n15 - (y.g - 22 + y.f)) / 45;
                        int n18 = (n2 - (y.h - 22)) / 45;
                        if (n17 < 0 || n18 < 0 || n17 >= 9 || n18 >= 4) {
                            if (n3 == 0) return;
                            y.o = false;
                            y.c(2);
                            return;
                        }
                        int n19 = n18 * 9 + n17;
                        if (n19 == y.b) {
                            i.a(4096, n3 != 0);
                            return;
                        }
                        y.b = (byte)n19;
                        return;
                    }
                    case 2: 
                    case 5: {
                        int n20 = n2;
                        int n21 = n3;
                        n3 = by;
                        n2 = n21;
                        n4 = n20;
                        if (i.a(n20, n2, n3 != 0)) return;
                        if (i.b(n15, n2, n3 != 0)) return;
                        if (i.c(n15, n2, n3 != 0)) return;
                        if (i.d(n15, n2, n3 != 0)) {
                            return;
                        }
                        ai ai2 = y.a;
                        int n22 = 0 + (y.a.e >> 16) - a.d;
                        int n23 = 0 + (y.a.f >> 16) - a.e;
                        if (y.a(n15, n2, n22 - 25, n23 - 12 - 25, 50, 50)) {
                            if (n3 != 0) return;
                            if (a == 1) {
                                i.a(0);
                                return;
                            }
                            if (ai2.a == 25) return;
                            if (y.B == 1) return;
                            i.a(1);
                            return;
                        }
                        ac ac2 = y.a[18];
                        int n24 = i.b();
                        ac2.a(n24, 0, 0, 0);
                        boolean bl2 = y.a(n4, n2, 55 + ac.a[0], k.bE + ac.a[1], ac.a[2] - ac.a[0], ac.a[3] - ac.a[1]);
                        int n25 = i.a();
                        ac2.a(n25, 0, 0, 0);
                        boolean bl3 = y.a(n4, n2, k.bG + ac.a[0], k.bH + ac.a[1], ac.a[2] - ac.a[0], ac.a[3] - ac.a[1]);
                        if (a == 1) {
                            if (ai2.a == 25) {
                                if (n4 < n22) {
                                    i.a(8, false);
                                    i.a(4, true);
                                    i.a(2, false);
                                    i.a(1, true);
                                    return;
                                }
                                if (n4 <= n22) return;
                                i.a(4, false);
                                i.a(8, true);
                                i.a(2, false);
                                i.a(1, true);
                                return;
                            }
                            if (bl2) {
                                i.a(256, n3 != 0);
                                return;
                            }
                            if (!bl3) return;
                            i.a(1024, n3 != 0);
                            return;
                        }
                        if (ai2.a == 3 && (ai2.a[15] == 1 || ai2.a[15] == 7 || ai2.a[15] == 19 || ai2.a[15] == 25 || ai2.a[15] == 31)) {
                            q.a(y.d);
                            int n26 = q.b();
                            if (y.a(n4, n2, n22 - 21, n23 + -50 - 85, 42, n26 + 42)) {
                                if (n3 != 0) return;
                                if (++y.bV <= 5) return;
                                y.bV = 1;
                                return;
                            }
                        }
                        if (ai2.a == 3 && a == 2) {
                            if (y.a.a[5] == -1) {
                                ac2.a(15, n22 + 30, n23 + -45, 0);
                                if (y.a(n4, n2, ac.a[0] - 25, ac.a[1] - 5, ac.a[2] - ac.a[0] + 25, ac.a[3] - ac.a[1] + 5)) {
                                    i.a(1, true);
                                    return;
                                }
                                ac2.a(19, n22 + 30, n23 + 45, 0);
                                if (y.a(n4, n2, ac.a[0] - 25, ac.a[1] - 5, ac.a[2] - ac.a[0] + 25, ac.a[3] - ac.a[1] + 5)) {
                                    i.a(2, true);
                                    return;
                                }
                                if (n3 != 0) return;
                                i.a(0);
                                return;
                            }
                            ac2.a(17, n22 + -30, n23 + -45, 0);
                            if (y.a(n4, n2, ac.a[0] - 25, ac.a[1] - 5, ac.a[2] - ac.a[0] + 25, ac.a[3] - ac.a[1] + 5)) {
                                System.out.println("AIM UP RIGHT");
                                i.a(1, true);
                                return;
                            }
                            ac2.a(21, n22 + -30, n23 + 45, 0);
                            if (y.a(n4, n2, ac.a[0] - 25, ac.a[1] - 5, ac.a[2] - ac.a[0] + 25, ac.a[3] - ac.a[1] + 5)) {
                                i.a(2, true);
                                return;
                            }
                            if (n3 != 0) return;
                            i.a(0);
                            return;
                        }
                        if (y.b != null) {
                            n22 = 0 + (y.b.e >> 16) - a.d;
                        }
                        if (n4 < n22) {
                            i.a(8, false);
                            i.a(4, n3 != 0);
                        } else if (n4 > n22) {
                            i.a(4, false);
                            i.a(8, n3 != 0);
                        }
                        if (ai2.a != 25) return;
                        if (n4 < n22) {
                            i.a(8, false);
                            i.a(4, true);
                            i.a(2, false);
                            i.a(1, true);
                            return;
                        }
                        if (n4 <= n22) return;
                        i.a(4, false);
                        i.a(8, true);
                        i.a(2, false);
                        i.a(1, true);
                        return;
                    }
                    case 13: {
                        int n27 = n2;
                        int n28 = n3;
                        n3 = by;
                        n2 = n28;
                        if (i.b(n27, n28, n3 != 0)) return;
                        ai ai3 = ai.a;
                        int n29 = 0 + (ai3.e >> 16) - a.d;
                        if (n15 < n29) {
                            i.a(8, false);
                            i.a(4, n3 != 0);
                            return;
                        }
                        if (n15 <= n29) return;
                        i.a(4, false);
                        i.a(8, n3 != 0);
                        return;
                    }
                    case 3: {
                        int n30 = n2;
                        int n31 = n3;
                        n3 = by;
                        n2 = n31;
                        if (i.a(n30, n31, n3 != 0)) return;
                        if (i.b(n15, n2, n3 != 0)) {
                            i.a();
                            return;
                        }
                        if (i.c(n15, n2, n3 != 0)) return;
                        if (i.d(n15, n2, n3 != 0)) {
                            return;
                        }
                        if (n2 < k.bO) {
                            i.a(1, n3 != 0);
                            i.a(2, false);
                            return;
                        }
                        if (n2 > k.G - k.bO) {
                            i.a(1, false);
                            i.a(2, n3 != 0);
                            return;
                        }
                        if (n15 < k.bP) {
                            i.a(8, false);
                            i.a(4, n3 != 0);
                            return;
                        }
                        if (n15 <= k.F - k.bP) return;
                        i.a(4, false);
                        i.a(8, n3 != 0);
                        return;
                    }
                    case 7: {
                        i.a(4096, by != 0);
                    }
                }
                return;
            }
            case 18: {
                y.a[9].a(62, k.bL, k.bM - 10, 0);
                if (y.a(n2, n3, ac.a[0], ac.a[1], ac.a[2] - ac.a[0], ac.a[3] - ac.a[1])) {
                    i.a(4096, by != 0);
                    return;
                }
                if (n2 < k.F / 2 && n3 > k.G / 2 - 75 && n3 < k.G / 2) {
                    i.a(4, by != 0);
                    return;
                }
                if (n2 > k.F / 2 && n3 > k.G / 2 - 75 && n3 < k.G / 2) {
                    i.a(8, by != 0);
                    return;
                }
                if (n3 < k.G / 2) {
                    i.a(1, by != 0);
                    return;
                }
                i.a(2, by != 0);
                return;
            }
            case 19: {
                if (n2 < k.F / 2) {
                    i.a(4, by != 0);
                    return;
                }
                i.a(8, by != 0);
                return;
            }
            case 11: 
            case 12: 
            case 13: {
                if (n2 < k.F / 2 - k.bQ) {
                    i.a(4, by != 0);
                    return;
                }
                if (n2 <= k.F / 2 + k.bQ) return;
                i.a(8, by != 0);
            }
        }
    }

    private static boolean a(int n2, int n3, boolean bl) {
        if (y.a != null && y.a.a != 17 && y.l && y.cg >= 0) {
            int n4 = (y.a - 170) / 2 - 7;
            if (y.a(n2, n3, n4, y.cg, 177, 59)) {
                i.a(y.bR, bl);
                return true;
            }
            y.a[9].a(59, 0, 0, 0);
            if (y.a(n2, n3, k.bN + ac.a[0], 0 + ac.a[1], ac.a[2] - ac.a[0], ac.a[3] - ac.a[1])) {
                return false;
            }
        }
        y.a[9].a(59, 0, 0, 0);
        if (ac.a[1] < 0) {
            ac.a[1] = 0;
        }
        if (y.a(n2, n3, 34 + ac.a[0], 0 + ac.a[1], ac.a[2] - ac.a[0], ac.a[3] - ac.a[1])) {
            i.a(y.bR, bl);
            return true;
        }
        if (y.a.a[12] != 1) {
            return false;
        }
        if (y.a(n2, n3, k.bN + ac.a[0], 0 + ac.a[1], ac.a[2] - ac.a[0], ac.a[3] - ac.a[1])) {
            i.a(y.E, bl);
            return true;
        }
        return false;
    }

    private static boolean b(int n2, int n3, boolean bl) {
        y.a[9].a(62, k.bL, k.bM - 10, 0);
        if (y.a(n2, n3, ac.a[0], ac.a[1], ac.a[2] - ac.a[0], ac.a[3] - ac.a[1])) {
            if (a == 2 || a == 3 || y.a != null && !y.b(y.a.a[15])) {
                i.a(4096, bl);
            } else {
                i.a(2);
            }
            return true;
        }
        return false;
    }

    static void a() {
        for (int i2 = 0; i2 < 30; ++i2) {
            y.a.c(1 << i2);
        }
    }

    private static void b(int n2, int n3, boolean bl) {
        int n4 = y.b(y.q);
        int n5 = i.a(y.q) - y.b(y.q);
        int n6 = i.a(y.q) + (y.u - 1) * y.b(y.q);
        int n7 = k.aq - 33;
        int n8 = 33 + k.aq;
        int n9 = y.r;
        if (n3 < n5) {
            i.a(1, bl);
            return;
        }
        if (n3 > n6) {
            i.a(2, bl);
            return;
        }
        if (n3 > n5 && n3 < n6) {
            n5 = k.ao;
            n6 = y.c();
            int n10 = 0;
            for (int i2 = y.s; i2 < n6 && n10 < y.u; ++i2) {
                if ((y.a[i2] & 0x2000) != 0) continue;
                ++n10;
                if (n3 < n5 + n4 && n3 > n5 - n4) {
                    y.r = i2;
                    break;
                }
                n5 += n4;
            }
            if (n9 == y.r) {
                if (n2 < n7 && n2 > n7 - 33) {
                    i.a(4, bl);
                    return;
                }
                if (n2 > n8 && n2 < n8 + 33) {
                    i.a(8, bl);
                }
            }
        }
    }

    private static int a() {
        int n2;
        if (y.a.a[5] == -1) {
            n2 = 8;
            if (t.a(1024)) {
                n2 = 4;
            }
        } else {
            n2 = 8;
            if (t.a(1024)) {
                n2 = 4;
            }
        }
        return n2;
    }

    private static int b() {
        int n2;
        if (y.a.a[5] == -1) {
            n2 = 10;
            if (t.a(256)) {
                n2 = 6;
            }
        } else {
            n2 = 10;
            if (t.a(256)) {
                n2 = 6;
            }
        }
        return n2;
    }

    private static int a(int n2) {
        int n3 = k.ad;
        if (y.b(n2)) {
            n3 = 2 * k.G / 3 + 20;
        } else if (n2 == 17) {
            n3 = (y.a[y.a(70)] & 0x6000) != 0 ? n3 + 47 - y.b(n2) : n3 + 47 - 2 * y.b(n2);
        } else if (n2 == 3) {
            n3 = n3 + 47 - 10;
        }
        if (y.b()) {
            n3 -= (y.b(n2) >> 2) + 5;
        }
        return n3;
    }

    private static void a(int n2, boolean bl) {
        if (bl) {
            y.a.b(n2);
            return;
        }
        y.a.c(n2);
    }

    static void a(o object) {
        ac ac2;
        ac.a((o)object);
        switch (y.o) {
            case 7: {
                switch (y.p) {
                    case 3: {
                        i.b();
                        if (b) {
                            y.a[9].a(62, k.bL, k.bM - 10, 0);
                        }
                        object = y.a[18];
                        int n2 = 9;
                        if (t.a(4)) {
                            n2 = 5;
                        }
                        ((ac)object).a(n2, 10, k.bE, 0);
                        n2 = 7;
                        if (t.a(8)) {
                            n2 = 3;
                        }
                        ((ac)object).a(n2, k.bF, k.bH, 0);
                        n2 = 12;
                        if (t.a(1)) {
                            n2 = 11;
                        }
                        ((ac)object).a(n2, k.bI, 10, 0);
                        n2 = 14;
                        if (t.a(2)) {
                            n2 = 13;
                        }
                        ((ac)object).a(n2, k.bJ, k.bK, 0);
                        break;
                    }
                    case 13: {
                        int n3 = 9;
                        ac ac3 = y.a[18];
                        if (t.a(4)) {
                            n3 = 5;
                        }
                        ac3.a(n3, 10, k.bE, 0);
                        n3 = 7;
                        if (t.a(8)) {
                            n3 = 3;
                        }
                        ac3.a(n3, k.bF, k.bH, 0);
                        y.a[9].a(62, k.bL, k.bM - 10, 0);
                        break;
                    }
                    case 2: 
                    case 5: {
                        object = y.a;
                        if (object == null || y.h) break;
                        if (((ai)object).a[12] != 0) {
                            ac ac4 = y.a[18];
                            int n4 = 0 + (((ai)object).e >> 16) - a.d;
                            int n5 = 0 + (((ai)object).f >> 16) - a.e;
                            int n6 = i.b();
                            int n7 = i.a();
                            if (a == 1) {
                                if (y.B != 1) {
                                    if (y.m % 8 < 7 && a) {
                                        ac4.a(7, y.m % 8, 55, k.bE, 0);
                                        ac4.a(6, y.m % 8, k.bG, k.bH, 0);
                                    } else {
                                        a = false;
                                        ac4.a(n6, 55, k.bE, 0);
                                        ac4.a(n7, k.bG, k.bH, 0);
                                    }
                                }
                            } else if (a == 0) {
                                if (((ai)object).a == 25) {
                                    if (y.B != 1) {
                                        n6 = 10;
                                        if (t.a(4)) {
                                            n6 = 6;
                                        }
                                        if (y.m % 8 < 7 && a) {
                                            ac4.a(7, y.m % 8, 55, k.bE, 0);
                                        } else {
                                            a = false;
                                            ac4.a(n6, 55, k.bE, 0);
                                        }
                                        n6 = 8;
                                        if (t.a(8)) {
                                            n6 = 4;
                                        }
                                        if (y.m % 8 < 7 && a) {
                                            ac4.a(6, y.m % 8, k.bG, k.bH, 0);
                                        } else {
                                            a = false;
                                            ac4.a(n6, k.bG, k.bH, 0);
                                        }
                                    }
                                } else {
                                    n6 = 9;
                                    if (t.a(4)) {
                                        n6 = 5;
                                    }
                                    if (y.m % 8 < 7 && a) {
                                        ac4.a(5, y.m % 8, 10, k.bE, 0);
                                    } else {
                                        a = false;
                                        ac4.a(n6, 10, k.bE, 0);
                                    }
                                    n6 = 7;
                                    if (t.a(8)) {
                                        n6 = 3;
                                    }
                                    if (y.m % 8 < 7 && a) {
                                        ac4.a(4, y.m % 8, k.bF, k.bH, 0);
                                    } else {
                                        a = false;
                                        ac4.a(n6, k.bF, k.bH, 0);
                                    }
                                }
                            }
                            if (a == 2 && ((ai)object).a == 3 && y.b(((ai)object).a[15])) {
                                if (y.a.a[5] == -1) {
                                    if (y.m % 4 < 3 && a) {
                                        ac4.a(2, y.m % 4, n4 + 30, n5 + -45, 0);
                                        ac4.a(8, y.m % 8, n4 + 30, n5 + 45, 0);
                                    } else {
                                        a = false;
                                        ac4.a(15, n4 + 30, n5 + -45, 0);
                                        ac4.a(19, n4 + 30, n5 + 45, 0);
                                    }
                                } else if (y.m % 4 < 3 && a) {
                                    ac4.a(3, y.m % 4, n4 + -30, n5 + -45, 0);
                                    ac4.a(9, y.m % 8, n4 + -30, n5 + 45, 0);
                                } else {
                                    a = false;
                                    ac4.a(17, n4 + -30, n5 + -45, 0);
                                    ac4.a(21, n4 + -30, n5 + 45, 0);
                                }
                            }
                            if (b) {
                                y.a[9].a(62, k.bL, k.bM - 10, 0);
                            }
                        }
                        i.b();
                    }
                }
                break;
            }
            case 18: {
                y.a[9].a(62, k.bL, k.bM - 10, 0);
                object = y.a[18];
                int n8 = 9;
                if (t.a(4)) {
                    n8 = 5;
                }
                ((ac)object).a(n8, 10, k.bE, 0);
                n8 = 7;
                if (t.a(8)) {
                    n8 = 3;
                }
                ((ac)object).a(n8, k.bF, k.bH, 0);
                n8 = 12;
                if (t.a(1)) {
                    n8 = 11;
                }
                ((ac)object).a(n8, k.bI, 10, 0);
                n8 = 14;
                if (t.a(2)) {
                    n8 = 13;
                }
                ((ac)object).a(n8, k.bJ, k.bK, 0);
            }
        }
        if (y.b != null) {
            y.a[9].a(62, k.bL, k.bM - 10, 0);
        }
        if (c && (ac2 = y.a[18]) != null) {
            ac2.a(b, c, d, 0);
            if (++b > 2) {
                c = false;
                b = 0;
            }
        }
    }

    private static void b() {
        if (!(y.l && y.cg >= 0 || y.f)) {
            if (!a.e) {
                y.a[9].a(59, 34, 0, 0);
            }
            if (!a.f) {
                y.a[9].a(60, k.bN, 0, 0);
            }
        }
        if (y.a.a[12] != 1) {
            return;
        }
    }

    static void a(int n2) {
        if (n2 != a) {
            i.a();
        }
        switch (n2) {
            case 0: {
                a = true;
                i.a(4, false);
                i.a(8, false);
                break;
            }
            case 2: {
                a = true;
                i.a(4096, false);
                break;
            }
            case 1: {
                a = true;
                i.a(256, false);
                i.a(1024, false);
            }
        }
        a = n2;
    }

    private static boolean c(int n2, int n3, boolean bl) {
        y.a[9].a(24, k.Q, k.R, 0);
        if (y.a(n2, n3, ac.a[0], ac.a[1], ac.a[2] - ac.a[0], ac.a[3] - ac.a[1])) {
            n3 = 64;
            if (n2 < k.F / 2) {
                n3 = 32;
            }
            i.a(n3, bl);
            return true;
        }
        return false;
    }

    private static boolean d(int n2, int n3, boolean bl) {
        y.a[9].a(20, 50, y.e, 0);
        if (y.a(n2, n3, ac.a[0], ac.a[1], ac.a[2] - ac.a[0], ac.a[3] - ac.a[1])) {
            n3 = 64;
            if (n2 < k.F / 2) {
                n3 = 32;
            }
            i.a(n3, bl);
            return true;
        }
        return false;
    }

    static {
        b = false;
    }
}

