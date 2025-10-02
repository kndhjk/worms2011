/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.media.Player
 */
import com.ea.sdk.SDKMIDlet;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Font;
import javax.microedition.media.Player;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class q {
    public byte[] a;
    public q a;
    public q b;
    public Player a;
    public String a;
    public q c;
    public int a;

    public static Object a(e e2, byte[] object) {
        Object[] objectArray = object;
        object = ae.a();
        int n2 = objectArray[0];
        int n3 = (n2 & 0x80) != 0 ? 1 : 0;
        int n4 = n3;
        n3 = (n2 & 0x40) != 0 ? 1 : 0;
        n2 = n3;
        byte[] byArray = new byte[12];
        System.arraycopy(objectArray, 1, byArray, 0, 7);
        byArray[7] = 0;
        byArray[8] = byArray[0];
        byArray[9] = byArray[1];
        byArray[10] = n4 != 0 ? 2 : 1;
        if (n2 != 0) {
            byArray[10] = (byte)(byArray[10] | 0x80);
        }
        short s2 = ae.a(objectArray, 8);
        n3 = ae.a(objectArray, 10);
        int n5 = 12;
        short[] sArray = new short[s2];
        for (n2 = 0; n2 < s2; ++n2) {
            sArray[n2] = ae.a(objectArray, n5);
            n5 += 2;
        }
        short[] sArray2 = new short[s2 + 1];
        for (n2 = 0; n2 < s2; ++n2) {
            sArray2[n2] = ae.a(objectArray, n5);
            n5 += 2;
        }
        sArray2[s2] = -1;
        n3 = (s2 << 1) + n3 * 6;
        byte[] byArray2 = new byte[n3];
        System.arraycopy(objectArray, n5, byArray2, 0, n3);
        short[] sArray3 = new short[256];
        for (n4 = 0; n4 < 128; n4 = (int)((short)(n4 + 1))) {
            sArray3[n4] = (short)ae.a(sArray, n4, 0, s2 - 1, sArray.length, (n)object);
        }
        byArray[11] = 1;
        Object[] objectArray2 = new Object[6];
        Object[] objectArray3 = objectArray2;
        objectArray2[0] = byArray;
        objectArray3[1] = sArray;
        objectArray3[2] = sArray3;
        objectArray3[3] = sArray2;
        objectArray3[4] = byArray2;
        objectArray3[5] = null;
        object = objectArray3;
        Object[] objectArray4 = new Object[8];
        objectArray = objectArray4;
        objectArray4[0] = e2;
        objectArray[1] = object[0];
        objectArray[2] = object[1];
        objectArray[3] = object[2];
        objectArray[4] = object[3];
        objectArray[5] = object[4];
        objectArray[6] = object[5];
        objectArray[7] = (byte)new Integer(-1);
        return objectArray;
    }

    public static void a(Object object) {
        n n2 = ae.a();
        ae.a().a.b = null;
        n2.a.a = null;
        n2.a.a = null;
        n2.a.b = null;
        n2.a.a = null;
        n2.a.c = null;
        n2.a.b = null;
        n2.a.a = null;
        if (object != null) {
            if (object instanceof Font) {
                n2.a.a = new byte[12];
                n2.a.a[0] = 1;
                n2.a.a[1] = 2;
                n2.a.a[7] = 0;
                n2.a.a[8] = 1;
                n2.a.a[9] = 2;
                n2.a.a[10] = 4;
                if (n2.a != null) {
                    Object object2 = object;
                    n2.a.a.a(object2);
                }
            } else {
                n2.a.a = ((Object[])object)[0];
                n2.a.a = (byte[])((Object[])object)[1];
                n2.a.a = (Integer)((Object[])object)[7];
                n2.a.b = (short[])((Object[])object)[2];
                n2.a.a = (short[])((Object[])object)[3];
                n2.a.c = (short[])((Object[])object)[4];
                n2.a.b = (byte[])((Object[])object)[5];
                n2.a.a = (int[])((Object[])object)[6];
                if (n2.a != null && n2.a.a[11] != n2.a[n2.d] && n2.a[n2.d] > 1) {
                    n n3 = n2;
                    int n4 = n3.a.b.length;
                    for (int n5 = 128; n5 < 256; n5 = (int)((short)(n5 + 1))) {
                        n3.a.a[n5] = (short)ae.a(n3.a.b, n3.d[n5 - 128], 0, n4 - 1, n4, n3);
                    }
                    n3.a.a[11] = n3.a[n3.d];
                }
            }
        }
        n2.a.b = object;
    }

    public static Object a(e objectArray) {
        n n2 = ae.a();
        ae.a().a.b = null;
        n2.a.a = objectArray;
        n2.a.a = -1;
        Object[] objectArray2 = new Object[8];
        objectArray = objectArray2;
        objectArray2[0] = n2.a.a;
        objectArray[1] = n2.a.a;
        objectArray[2] = n2.a.b;
        objectArray[3] = n2.a.a;
        objectArray[4] = n2.a.c;
        objectArray[5] = n2.a.b;
        objectArray[6] = n2.a.a;
        objectArray[7] = new Integer(n2.a.a);
        n2.a.b = objectArray;
        return ae.a().a.b;
    }

    public static int a() {
        return ae.a().a.a[2];
    }

    public static int b() {
        n n2 = ae.a();
        if ((n2.a.a[10] & 4) != 0) {
            return ((Font)n2.a.b).getHeight();
        }
        return (n2.a.a[3] & 0xFF) + (n2.a.a[4] & 0xFF) + n2.a.a[2];
    }

    public static void a(c c2, int n2, int n3, int n4) {
        q.a(c2, 0, c2.b, n2, n3, n4);
    }

    private static void a(c c2, int n2, int n3, int n4, int n5, int n6) {
        n n7 = ae.a();
        if ((n7.a.a[10] & 4) != 0) {
            if (n7.a == null) {
                n7.a = new StringBuffer();
            }
            n7.a.setLength(0);
            for (int i2 = n2; i2 < n2 + n3; ++i2) {
                char c3 = c2.a(i2);
                if (c3 == '\u00ad' && i2 != n2 + n3 - 1) continue;
                n7.a.append(c3);
            }
            int n8 = n4;
            int n9 = n5;
            n5 = n6;
            n4 = n9;
            n3 = n8;
            String string = n7.a.toString();
            n7.a.a.a(string, n3, n4, n5);
            return;
        }
        int n10 = n7.a.a[3] & 0xFF;
        int n11 = q.b();
        int n12 = n7.a.a[8];
        int n13 = n7.a.a[9];
        int n14 = (n7.a.a[10] & 2) != 0 ? 1 : 0;
        int n15 = n14;
        int n16 = 0;
        n14 = 0;
        if ((n6 & 8) != 0) {
            n16 = 0 - q.a(c2, n2, n3);
        } else if ((n6 & 1) != 0) {
            n16 = 0 - (q.a(c2, n2, n3) >> 1);
        }
        if ((n6 & 0x40) != 0) {
            n14 = 0 - n10;
        } else if ((n6 & 0x20) != 0) {
            n14 = 0 - n11;
        }
        if (n12 == 1) {
            n4 += n16;
            n5 += n14;
        } else if (n12 == 4) {
            n4 -= n16;
            n5 -= n14;
        } else if (n12 == 2) {
            n4 -= n14;
            n5 += n16;
        } else if (n12 == 8) {
            n4 -= n14;
            n5 -= n16;
        }
        n7.a[0] = n4;
        n7.a[1] = n5;
        int n17 = c2.a & 0x3F;
        n14 = (n12 & 5) != 0 ? (n12 & 4) >> 1 : ((n13 & 1) << 1) + ((~n13 & 2) >> 1);
        byte by = (byte)n14;
        n14 = (n12 & 0xA) != 0 ? (n12 & 8) >> 2 : (n13 & 2) + (~n13 & 1);
        byte by2 = (byte)n14;
        int n18 = n7.a.a.e();
        for (int i3 = n2; i3 < n2 + n3; ++i3) {
            n12 = c2.a(i3);
            if (n12 == 173 && i3 != n2 + n3 - 1) continue;
            n14 = n7.a((short)n12, n17);
            n16 = n7.a((short)n14);
            if (n14 == -1) {
                if (n12 != 32) {
                    n7.a.a(65280);
                    n7.a.c(n7.a[0], n7.a[1], n16, n11);
                    n7.a.a(0xFF0000);
                    n7.a.a(n7.a[0], n7.a[1], n7.a[0] + n16, n7.a[1] + n11);
                    n7.a.a(n7.a[0], n7.a[1] + n11, n7.a[0] + n16, n7.a[1]);
                }
                n7.a(n7.a, n16);
                continue;
            }
            n14 = n14 + 1;
            short s2 = (short)(n14 + 1);
            int n19 = n7.a.b[n14] & 0xFF;
            for (n14 = 0; n14 < n19; ++n14) {
                int n20;
                if (n15 != 0) continue;
                n13 = n7.a.b[s2] & 0xFF;
                s2 = (short)(s2 + 1);
                n6 = n7.a.b[s2] & 0xFF;
                s2 = (short)(s2 + 1);
                n5 = n7.a.b[s2];
                s2 = (short)(s2 + 1);
                byte by3 = n7.a.b[s2];
                s2 = (short)(s2 + 1);
                n4 = n7.a.b[s2] & 0xFF;
                short s3 = (short)(s2 + 1);
                s2 = (short)(s3 + 1);
                n12 = n7.a.b[s3] & 0xFF;
                n7.b[0] = n5;
                n7.b[1] = n20 = by3 - n10;
                n7.b[2] = -n5 - n4;
                n7.b[3] = n10 - by3 - n12;
                n7.a.a((e)n7.a.a, n13, n6, n4, n12, n7.a.a[7], n7.a[0] + n7.b[by], n7.a[1] + n7.b[by2], 0);
            }
            n7.a(n7.a, n16);
        }
        n7.a.a(n18);
    }

    public static void a(c c2, short[] sArray, int n2, int n3, int n4, int n5, int n6) {
        n n7 = ae.a();
        int n8 = q.b();
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        if ((n6 & 2) != 0) {
            n11 = sArray[0] * n8 - n7.a.a[2] >> 1;
            n6 ^= 2;
        } else if ((n6 & 0x20) != 0) {
            n11 = sArray[0] * n8 - n7.a.a[2];
            n6 ^= 0x20;
        }
        n6 |= 0x10;
        if (n7.a.a[9] == 1) {
            n4 -= n11;
            n9 = n8;
        } else if (n7.a.a[9] == 4) {
            n4 += n11;
            n9 = -n8;
        } else if (n7.a.a[9] == 2) {
            n5 -= n11;
            n10 = n8;
        } else {
            n5 += n11;
            n10 = -n8;
        }
        short s2 = sArray[(sArray[0] & 0xFFFF) + 2];
        for (int i2 = n2; i2 < n2 + n3; ++i2) {
            int n12 = sArray[i2] & 0xFFFF;
            n11 = (sArray[i2 + 1] & 0xFFFF) - n12;
            short s3 = c2.a((sArray[i2 + 1] & 0xFFFF) - 1);
            n8 = s3;
            if (s3 == s2 || n8 == 32) {
                --n11;
            }
            q.a(c2, n12, n11, n4, n5, n6);
            n4 += n9;
            n5 += n10;
        }
    }

    public static short[] a(c c2, short[] sArray, int n2, short n3) {
        n3 = n2;
        short[] sArray2 = sArray;
        int n4 = c2.b;
        n n5 = ae.a();
        boolean bl = false;
        if (sArray2 == null) {
            if (n5.e == null) {
                n5.e = new short[50];
                n5.b = 50;
            }
            sArray2 = n5.e;
            bl = true;
        }
        int n6 = c2.a & 0x3F;
        int n7 = 0;
        int n8 = 0;
        int n9 = -1;
        sArray2[1] = 0;
        int n10 = 2;
        for (int i2 = 0; i2 < n4; ++i2) {
            short s2 = c2.a(i2);
            if (bl && n10 + 3 >= n5.b) {
                n5.e = new short[n5.b + 50];
                ae.a(sArray2, n5.e, n5.b);
                sArray2 = n5.e;
                n5.b += 50;
            }
            if (s2 == 124) {
                sArray2[n10++] = (short)(i2 + 1);
                n7 = 0;
                n8 = 0;
                n9 = -1;
                continue;
            }
            int n11 = (n5.a.a[10] & 4) != 0 ? ((Font)n5.a.b).charWidth(c2.a(i2)) : n5.a(n5.a(s2, n6));
            n8 += n11;
            if ((n7 += n11) > n3) {
                if (n9 == -1) {
                    sArray2[n10++] = (short)i2;
                    n7 = n11;
                    n8 = 0;
                    continue;
                }
                sArray2[n10++] = (short)(n9 + 1);
                n9 = s2 == 32 || s2 == 173 ? i2 : -1;
                n7 = n8;
                n8 = 0;
                continue;
            }
            if (s2 != 32 && s2 != 173) continue;
            n9 = i2;
            n8 = 0;
        }
        sArray2[0] = (short)(n10 - 1);
        sArray2[n10] = (short)n4;
        sArray2[n10 + 1] = 124;
        if (bl) {
            short[] sArray3 = new short[n10 + 2];
            ae.a(sArray2, sArray3, n10 + 2);
            sArray2 = sArray3;
        }
        return sArray2;
    }

    public static int a(c c2) {
        return q.a(c2, 0, c2.b);
    }

    private static int a(c c2, int n2, int n3) {
        n n4 = ae.a();
        int n5 = 0;
        if ((n4.a.a[10] & 4) != 0) {
            n5 = ((Font)n4.a.b).substringWidth(c2.toString(), n2, n3);
        } else {
            int n6 = c2.a & 0x3F;
            for (int i2 = n2; i2 < n2 + n3; ++i2) {
                n5 += n4.a(n4.a(c2.a(i2), n6));
            }
        }
        return n5;
    }

    private static boolean c(int n2) {
        n n3 = ae.a();
        boolean bl = n3.c[n2];
        bl = n3.b[bl] != null && n3.d[bl] == n2;
        return bl;
    }

    public static int a(int n2) {
        n n3 = ae.a();
        SDKMIDlet sDKMIDlet = SDKMIDlet.a;
        byte[] byArray = new byte[2];
        if (q.c(n2) && !n3.b) {
            return n3.a[n2];
        }
        InputStream inputStream = null;
        try {
            int n4 = (n3.b[n2] & 0x40) == 0 ? n3.d : 0;
            int n5 = n4;
            if (n3.a == 0) {
                inputStream = sDKMIDlet.getClass().getResourceAsStream("/t_" + new String(n3.a[n5]).trim());
                for (n4 = 1; n4 < n2; ++n4) {
                    if ((n3.b[n4] & 0x40) != 0 && n5 != 0) continue;
                    long l2 = (n3.a[n4] + 1 << 1) + (n3.a[n5][n4] & 0xFFFF);
                    inputStream.skip(l2);
                }
            } else if (n3.a == 1) {
                inputStream = sDKMIDlet.getClass().getResourceAsStream("/t_" + new String(n3.a[n5]).trim() + n2);
            }
            if (n3.b[n4 = n3.c[n2]] == null) {
                n3.b[n4] = new short[n3.c[n4]];
            }
            for (int i2 = 0; i2 < n3.a[n2] + 1; ++i2) {
                byArray[0] = (byte)inputStream.read();
                byArray[1] = (byte)inputStream.read();
                n3.b[n4][i2] = ae.a(byArray, 0);
            }
            if (n3.b[n4] == null) {
                n3.b[n4] = new byte[n3.b[n4] & 0xFFFF];
            }
            int n6 = n3.a[n5][n2] & 0xFFFF;
            byte[] byArray2 = n3.b[n4];
            inputStream.read(byArray2, 0, n6);
            n3.d[n4] = (byte)n2;
            inputStream.close();
        }
        catch (IOException iOException) {}
        return n3.a[n2];
    }

    public static int a(byte[] byArray) {
        int n2;
        int n3;
        n n4 = ae.a();
        if (n4.a) {
            return n4.e;
        }
        n4.a = byArray[1];
        n4.a = (byArray[2] & 0xFF) << 16 | (byArray[3] & 0xFF) << 8 | byArray[4] & 0xFF;
        short s2 = ae.a(byArray, 5);
        n4.e = byArray[7];
        int n5 = 10;
        n4.c = (byte)(byArray[8] + 1);
        n4.b = (byte)(byArray[9] + 1);
        n4.a = new byte[n4.e];
        n4.a = new byte[n4.e][];
        n4.e = new byte[n4.e];
        n4.a = new short[n4.b];
        n4.b = new byte[n4.b];
        n4.c = new byte[n4.b];
        n4.a = new short[n4.e][];
        n4.b = new short[n4.b];
        for (n3 = 0; n3 < n4.b.length; ++n3) {
            n4.b[n3] = 0;
        }
        n4.c = new short[n4.b];
        for (n3 = 0; n3 < n4.c.length; ++n3) {
            n4.c[n3] = 0;
        }
        n4.d = new byte[n4.b];
        n4.b = new byte[n4.c][];
        n4.b = new short[n4.c][];
        for (n3 = 0; n3 < n4.c; ++n3) {
            n4.b[n3] = null;
        }
        n4.a[0] = s2;
        for (n3 = 0; n3 < n4.e; ++n3) {
            n4.a[n3] = new short[n4.b];
        }
        for (n3 = 0; n3 < n4.c; ++n3) {
            n4.b[n3] = null;
        }
        int n6 = s2 + 1;
        for (n2 = 0; n2 < n4.e; ++n2) {
            n4.a[n2] = new byte[5];
            for (n3 = 0; n3 < 5; ++n3) {
                n4.a[n2][n3] = byArray[n5 + n3];
            }
            short s3 = (short)(n5 + 5);
            n3 = (short)(s3 + 1);
            n4.a[n2] = byArray[s3];
            n5 = (short)(n3 + 1);
            n4.e[n2] = byArray[n3];
            if (s2 <= 0) continue;
            if (n4.b[0] == null) {
                n4.b[0] = new short[n4.e * n6];
            }
            for (n3 = 0; n3 < n6; ++n3) {
                n4.b[0][n2 * n6 + n3] = ae.a(byArray, n5);
                n5 = (short)(n5 + 2);
            }
        }
        if (s2 > 0) {
            n2 = n4.b[0][n4.e * n6 - 1];
            n4.b[0] = new byte[n2];
            ae.a(n4.b[0], byArray, n5, n2);
            n5 = (short)(n5 + n2);
        }
        for (n2 = 1; n2 < n4.b; ++n2) {
            n4.b[n2] = (byte)(byArray[n5] & 0xC0);
            n4.c[n2] = (byte)(byArray[n5] & 0x3F);
            n6 = n5 + 1;
            short[] sArray = n4.a;
            sArray[n2] = n5 = (int)ae.a(byArray, n6);
            n5 = (short)(n6 + 2);
            if (n4.a[n2] + 1 > n4.c[n4.c[n2]]) {
                n4.c[n4.c[n2]] = (short)(n4.a[n2] + 1);
            }
            for (n6 = 0; n6 < n4.e; ++n6) {
                n4.a[n6][n2] = ae.a(byArray, n5);
                if ((n4.a[n6][n2] & 0xFFFF) > (n4.b[n4.c[n2]] & 0xFFFF)) {
                    n4.b[n4.c[n2]] = n4.a[n6][n2];
                }
                n5 = (short)(n5 + 2);
            }
        }
        if (n4.a[n4.d] > 1) {
            n4.a(n4.a[n4.d]);
        }
        n4.a = true;
        return n4.e;
    }

    public static c a(int n2, int n3, c c2) {
        n n4 = ae.a();
        if (2 >= n4.a[0]) {
            return c2;
        }
        n3 = 2 + (n4.a[0] + 1) * n2;
        if (c2 == null) {
            c2 = new c();
        } else if ((c2.a & 0x40) != 0) {
            c2.a = null;
            c2.a = null;
        }
        c2.a = n4.b[0];
        c2.a = n4.b[0][n3];
        c2.c = c2.b = n4.b[0][n3 + 1] - n4.b[0][n3] >> 1;
        c2.a = 0;
        return c2;
    }

    public static c a(int n2, c c2) {
        int n3;
        n n4 = ae.a();
        int n5 = -1;
        int n6 = 0;
        for (n3 = 0; n3 < n4.b; ++n3) {
            if (n2 >= (n6 += n4.a[n3])) continue;
            n5 = n3;
            break;
        }
        n3 = n2 - (n6 - n4.a[n5]);
        n6 = n4.c[n5];
        if (c2 == null) {
            c2 = new c();
        } else if ((c2.a & 0x40) != 0) {
            c2.a = null;
            c2.a = null;
        }
        c2.a = n4.b[n6];
        c2.a = n4.b[n6][n3] & 0xFFFF;
        c2.b = (n4.b[n6][n3 + 1] & 0xFFFF) - (n4.b[n6][n3] & 0xFFFF);
        n3 = n4.a[n4.d];
        if ((n4.b[n5] & 0xFFFFFFC1) != 0) {
            n3 = 0;
        }
        if (n3 == 0) {
            c2.b = (short)(c2.b >> 1);
        }
        c2.a = (byte)n3;
        c2.c = c2.b;
        return c2;
    }

    public static boolean a(int n2) {
        int n3;
        n n4 = ae.a();
        byte by = n4.d;
        if (n4.a != null && n2 >= 0 && n2 < n4.e) {
            n4.d = (byte)n2;
        }
        if (n4.d != by) {
            n4.b = true;
            for (n3 = 1; n3 < n4.b; ++n3) {
                if (!q.c(n3) || (n4.b[n3] & 0x40) != 0) continue;
                q.a(n3);
            }
            n4.b = false;
            if (n4.a[n4.d] != n4.a[by] && n4.a[n4.d] > 1) {
                n4.a(n4.a[n4.d]);
            }
        }
        n3 = n4.d == n2 ? 1 : 0;
        return n3 != 0;
    }

    public static void a(o o2) {
        ae.a().a = o2;
    }

    public static void a(byte[] byArray) {
        ae.a(1, byArray, byArray.length, ae.b());
        ae.b();
    }

    public static byte[] a(int n2) {
        n2 = ae.a(1, ae.b());
        if (n2 == -1) {
            return null;
        }
        ae.b();
        byte[] byArray = new byte[n2];
        ae.a(1, byArray);
        return byArray;
    }

    public static boolean b(int n2) {
        n2 = !ae.a(1, ae.b()) ? 1 : 0;
        return n2 != 0;
    }

    public static int b(int n2) {
        int n3;
        if (ae.a().a.length == 1) {
            return 0;
        }
        String string = SDKMIDlet.a("Force-Locale");
        int n4 = ae.a().a.length;
        String[] stringArray = new String[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            stringArray[n3] = new String(ae.a().a[n3]);
        }
        if (n2 == -1) {
            int n5;
            if (string == null) {
                n5 = 2;
            } else if ((string = string.toLowerCase().trim()).length() < 2) {
                n5 = 2;
            } else if (string.equals("menu")) {
                n5 = 1;
            } else if (string.startsWith("auto-")) {
                n5 = 3;
                string = string.substring(5);
            } else {
                n5 = 4;
            }
            for (n3 = 0; n3 < stringArray.length; ++n3) {
                if (stringArray[n3].length() <= 2) continue;
                String string2 = stringArray[n3].substring(0, 2);
                n4 = 1;
                for (int i2 = 0; i2 < stringArray.length; ++i2) {
                    if (n3 == i2 || !stringArray[i2].startsWith(string2)) continue;
                    n4 = 0;
                    break;
                }
                if (n4 == 0) continue;
                stringArray[n3] = string2;
            }
            if (n5 == 2 || n5 == 3 || n5 == 1) {
                n2 = q.a(stringArray);
                if (n5 == 1 && n2 >= 0) {
                    n2 = -1 - n2;
                }
            }
            if (n5 == 4 || n5 == 3 && n2 == -1) {
                for (int i3 = 0; i3 < stringArray.length; ++i3) {
                    if (!string.startsWith(stringArray[i3])) continue;
                    n2 = i3;
                    break;
                }
            }
            if (n5 == 4 && n2 == -1) {
                n2 = q.a(stringArray);
            }
        }
        return n2;
    }

    public static short a(byte[] byArray, int n2) {
        return (short)((byArray[n2] & 0xFF) << 8 | byArray[n2 + 1] & 0xFF);
    }

    public static e a(int n2, int n3) {
        return new e(n2, n3);
    }

    public static e a(byte[] byArray, int n2) {
        return new e(byArray, 0, n2);
    }

    public static e a(String string) {
        e e2;
        e e3 = e2;
        e2 = new e(string);
        if (e3.a.a() == null) {
            throw new IOException("Error creating SDKImage from a file path.");
        }
        return e3;
    }

    private static byte a(String[] stringArray) {
        int n2 = -1;
        String string = System.getProperty("microedition.locale");
        if (string != null) {
            String string2 = string.toLowerCase().trim();
            int n3 = string2.length();
            if (n3 < 2) {
                return -1;
            }
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                if (stringArray[i2].length() > n3 && stringArray[i2].startsWith(string2)) {
                    n2 = -1;
                    break;
                }
                if (!string2.startsWith(stringArray[i2])) continue;
                n2 = (byte)i2;
                break;
            }
        }
        return (byte)n2;
    }

    public q() {
    }

    private q(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                return;
            }
        } else {
            this.a = new q(2);
            return;
        }
        this.a = new String();
        this.b = new q(0);
    }

    private q(q q2, String string) {
        this.a = new q(2);
        this.a = new q(2);
        this.a.a = string;
        this.a.b = q2;
    }

    public q(byte[] byArray, int n2) {
        q q2;
        q q3;
        this.a = n2;
        q q4 = q3;
        q3 = new q(0);
        q4.a = byArray;
        String string = new String("Undefined");
        switch (byArray[0]) {
            case 77: {
                string = "audio/midi";
                break;
            }
            case 35: {
                string = "audio/amr";
                break;
            }
            case 82: {
                string = "audio/x-wav";
                break;
            }
            case -1: 
            case 73: {
                string = "audio/mpeg";
            }
        }
        this.c = q2 = new q(q4, string);
    }
}

