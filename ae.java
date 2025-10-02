/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.media.Manager
 *  javax.microedition.media.control.VolumeControl
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ae {
    public int a;
    public short[] a;
    public int[] a;
    public Graphics a;
    public static ad a;
    public static Object a;
    public static z a;
    public static v a;
    public static aa a;
    public static long a;
    public static boolean a;
    public static z b;
    public static ae a;
    public static short a;
    private static byte[] a;
    private static RecordStore a;
    private static byte[] b;
    private static int b;
    private static int c;
    private static int d;
    private static boolean b;

    public static ae a(ab ab2) {
        return new ae(ab2);
    }

    private ae(int[] nArray) {
        ae.a(nArray, this);
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.a.drawLine(n2, n3, n4, n5);
    }

    public final void a(int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        this.a.drawRGB(nArray, 0, n7, n3, n4, n5, n6, true);
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.fillArc(n2, n3, n4, n5, 0, 360);
    }

    public final void b(int n2, int n3, int n4, int n5) {
        this.a.fillRect(n2, n3, n4, n5);
    }

    public final void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.fillRoundRect(n2, n3, n4, n5, 10, 10);
    }

    public final void c(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.fillTriangle(n2, n3, n4, n5, n6, n7);
    }

    public final void a(Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.a.drawRegion(image, n2, n3, n4, n5, n6 >>> 16, n7, n8, n9);
    }

    public final int a() {
        return this.a.getClipHeight();
    }

    public final int b() {
        return this.a.getClipWidth();
    }

    public final int c() {
        return this.a.getClipX();
    }

    public final int d() {
        return this.a.getClipY();
    }

    public final void c(int n2, int n3, int n4, int n5) {
        this.a.setClip(n2, n3, n4, n5);
    }

    public final int e() {
        return this.a.getColor();
    }

    public final void a(int n2) {
        this.a.setColor(n2 & 0xFFFFFF);
    }

    public final void a(Object object) {
        this.a.setFont((Font)object);
    }

    public final void a(String string, int n2, int n3, int n4) {
        this.a.drawString(string, n2, n3, n4);
    }

    public final short[] a() {
        return this.a;
    }

    private ae(ab ab2) {
        ae.a(ae.a((int)ab2.a, (int)ab2.b, 24), this);
        this.a = ((u)ab2).a.getGraphics();
    }

    private static void a(int[] nArray, ae ae2) {
        ae2.a = ae.a(nArray);
        short s2 = (short)nArray[0];
        short s3 = (short)nArray[1];
        short[] sArray = new short[4];
        short[] sArray2 = sArray;
        sArray[0] = 0;
        sArray2[1] = 0;
        sArray2[2] = s2;
        sArray2[3] = s3;
        ae2.a = sArray2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(d var0) {
        while (var0.a != 2) {
            var0 = var0.a;
        }
        while (true) {
            block42: {
                if (ae.a(var1_1 = var0.b) != 200 || var1_1.a == null && !ae.a(var1_1)) break block42;
                var2_2 = ae.a();
                var3_3 = true;
                var4_4 = false;
                while (!var4_4) {
                    try {
                        synchronized (var2_2) {
                            block41: {
                                if (var1_1.a.getState() == 300) ** GOTO lbl-1000
                                var5_6 = var2_2.b;
                                var6_7 = var1_1.a;
                                var7_8 = var3_3;
                                var8_9 = 0x7FFFFFFF;
                                var9_10 = -1;
                                var10_11 = false;
                                var11_12 = var5_6.a;
                                var12_13 = 0x7FFFFFFF;
                                var13_14 = -1;
                                var14_15 = 0;
                                var16_19 = ae.a();
                                synchronized (var16_19) {
                                    for (var15_17 = 0; var15_17 < ae.a; ++var15_17) {
                                        if (var11_12[var15_17] == null) {
                                            if (var7_8 && !var10_11) {
                                                // MONITOREXIT @DISABLED, blocks:[0, 17, 18, 19, 38, 40, 9, 10] lbl28 : MonitorExitStatement: MONITOREXIT : var16_19
                                                var5_5 = var15_17;
                                                break block41;
                                            }
                                        } else if (var11_12[var15_17].a == var6_7) {
                                            var14_15 = (short)(var14_15 + 1);
                                        }
                                        if (var6_7.equals("audio/midi")) {
                                            if (var14_15 == 16) {
                                                var10_11 = true;
                                            }
                                        } else if (var6_7.equals("audio/x-wav")) {
                                            if (var14_15 == 16) {
                                                var10_11 = true;
                                            }
                                        } else if (var6_7.equals("audio/amr") && var14_15 == 16) {
                                            var10_11 = true;
                                        }
                                        if (var11_12[var15_17] != null && var11_12[var15_17].a == var6_7 && var5_6.a[var15_17] < var12_13) {
                                            var12_13 = var5_6.a[var15_17];
                                            var13_14 = var15_17;
                                        }
                                        if (var5_6.a[var15_17] >= var8_9 || var10_11 || var11_12[var15_17] == null) continue;
                                        var8_9 = var5_6.a[var15_17];
                                        var9_10 = var15_17;
                                    }
                                    if (var10_11) {
                                        var9_10 = var13_14;
                                    }
                                    if (var9_10 != -1) {
                                        var15_18 = var11_12[var9_10];
                                        for (var14_15 = 0; var14_15 <= 0; ++var14_15) {
                                            if (ae.a().a[var14_15].a.a.a != var15_18) continue;
                                            try {
                                                var14_16 = ae.a();
                                                synchronized (var14_16) {
                                                    ae.b(var15_18, ae.a().b);
                                                    var15_18.a.deallocate();
                                                }
                                            }
                                            catch (Throwable v0) {}
                                            var5_5 = var9_10;
                                            break block41;
                                        }
                                        ae.a(var15_18);
                                    }
                                }
                                var5_5 = var9_10;
                            }
                            if (var5_5 == -1) lbl-1000:
                            // 2 sources

                            {
                                var4_4 = true;
                            } else {
                                var1_1.a.prefetch();
                                var6_7 = var2_2.b;
                                synchronized (var6_7) {
                                    var6_7.a[var5_5] = var1_1;
                                    v1 = var5_5;
                                    v2 = var6_7.a;
                                    var6_7.a = var5_5 = v2 + 1;
                                    var6_7.a[v1] = v2;
                                }
                            }
                        }
                    }
                    catch (Throwable v3) {
                        var3_3 = false;
                    }
                }
            }
            try {
                var6_7 = ae.a();
                synchronized (var6_7) {
                    if (ae.a(var1_1) == 300) {
                        ae.a();
                        if (!ae.a().a) {
                            ae.c(var0);
                            if (var0.b) {
                                var0.b = false;
                            }
                            var1_1.a.start();
                        }
                    }
                    return;
                }
            }
            catch (Throwable v4) {
                if (var0.a >= 20) {
                    return;
                }
                ++var0.a;
                continue;
            }
            break;
        }
    }

    public static void a(int n2, byte[] byArray, int n3, g g2) {
        while (true) {
            if (g2.a != 5) {
                try {
                    ae.a(1, true);
                    if (b == null) {
                        byte[] byArray2 = new byte[n3 + 3];
                        b = byArray2;
                        byArray2[0] = (byte)d;
                        ae.b[1] = (byte)(n3 >> 8);
                        ae.b[2] = (byte)n3;
                        System.arraycopy(byArray, 0, b, 3, n3);
                        a.setRecord(c, b, 0, b.length);
                    } else {
                        n2 = 0;
                        if (b < b.length) {
                            n2 = (b[b + 1] & 0xFF) << 8 | b[b + 2] & 0xFF;
                        }
                        if (n2 == n3) {
                            System.arraycopy(byArray, 0, b += 3, b, n3);
                            a.setRecord(c, b, 0, b.length);
                        } else if (n2 > n3) {
                            ((byte[])(++ae.b))[ae.b++] = (byte)(n3 >> 8);
                            ae.b[ae.b++] = (byte)n3;
                            System.arraycopy(byArray, 0, b, b, n3);
                            System.arraycopy(b, b + n2, b, b + n3, b.length - b - n2);
                            a.setRecord(c, b, 0, b.length - n2 + n3);
                        } else {
                            int n4 = b.length + n3 - n2;
                            if (n2 == 0) {
                                n4 += 3;
                            }
                            byte[] byArray3 = new byte[n4];
                            System.arraycopy(b, 0, byArray3, 0, b);
                            byArray3[ae.b++] = (byte)d;
                            byArray3[ae.b++] = (byte)(n3 >> 8);
                            byArray3[ae.b++] = (byte)n3;
                            System.arraycopy(byArray, 0, byArray3, b, n3);
                            if (n2 != 0) {
                                System.arraycopy(b, b + n2, byArray3, b + n3, b.length - (b + n2));
                            }
                            a.setRecord(c, byArray3, 0, byArray3.length);
                        }
                    }
                    a.closeRecordStore();
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            g2 = g2.a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(short s2, short s3, short s4, z z2) {
        if ((z2.c || z2.a) && s2 != 6) {
            return;
        }
        switch (s2) {
            case 5: {
                z2.c = true;
                ae.a();
                z2.d = ae.a().a;
                ae.a();
                ae.a();
                ae.a(true);
                ae.a(0, ae.a().a);
                long[] lArray = z2.a;
                synchronized (z2.a) {
                    z2.a = 0;
                    // ** MonitorExit[var4_4] (shouldn't be in output)
                    break;
                }
            }
            case 6: {
                ae.a();
                ae.a();
                ae.a(false);
                break;
            }
        }
        {
            int n2 = 1;
            long[] lArray = z2.a;
            synchronized (z2.a) {
                switch (s2) {
                    case 1: 
                    case 9: {
                        if (z2.a < 5) break;
                        return;
                    }
                    case 5: 
                    case 6: {
                        if (z2.a < 8) break;
                        return;
                    }
                    default: {
                        if (z2.a < 6) break;
                        return;
                    }
                }
                if (n2 == 0) return;
                int n3 = z2.a;
                z2.a = n2 = n3 + 1;
                z2.a[n3] = (long)s2 << 48 | (long)s3 << 32 & 0xFFFF00000000L | (long)s4 << 16 & 0xFFFF0000L;
                // ** MonitorExit[var5_6] (shouldn't be in output)
                return;
            }
        }
    }

    private static int d(int n2) {
        if (n2 == -9996) {
            return 1;
        }
        if (n2 == -9997) {
            return 2;
        }
        if (n2 == -9998) {
            return 3;
        }
        if (n2 == -9999) {
            return 4;
        }
        if (n2 == 0) {
            return 9;
        }
        if (n2 == 0) {
            return 10;
        }
        if (n2 == 0) {
            return 16;
        }
        if (n2 == 0) {
            return 15;
        }
        if (n2 == 0) {
            return 7;
        }
        if (n2 == 0) {
            return 13;
        }
        if (n2 == 0) {
            return 14;
        }
        if (n2 == -10) {
            return 0;
        }
        if (n2 == 99999) {
            return 0;
        }
        if (n2 == 0) {
            return 0;
        }
        if (n2 == 0) {
            return 0;
        }
        if (n2 == 99999) {
            return 0;
        }
        if (n2 == 99999) {
            return 0;
        }
        if (n2 >= 48 && n2 <= 57) {
            n2 = n2 - 48 + 17;
        } else {
            switch (n2) {
                case 42: {
                    n2 = 16;
                    break;
                }
                case 35: {
                    n2 = 15;
                    break;
                }
                case 0: {
                    n2 = 0;
                    break;
                }
                default: {
                    int n3;
                    if (n2 >= 48 && n2 <= 57) {
                        n3 = n2 - 48 + 17;
                    } else {
                        switch (n2) {
                            case 8: {
                                n3 = 10;
                                break;
                            }
                            case 35: {
                                n3 = 15;
                                break;
                            }
                            case 42: {
                                n3 = 16;
                                break;
                            }
                            default: {
                                n3 = 0;
                            }
                        }
                    }
                    int n4 = n3;
                    if (n3 != 0) {
                        n2 = n3;
                        break;
                    }
                    try {
                        switch (a.getGameAction(n2)) {
                            case 1: {
                                n4 = 1;
                                break;
                            }
                            case 2: {
                                n4 = 3;
                                break;
                            }
                            case 5: {
                                n4 = 4;
                                break;
                            }
                            case 6: {
                                n4 = 2;
                                break;
                            }
                            case 8: {
                                n4 = 7;
                            }
                        }
                    }
                    catch (Exception exception) {}
                    n2 = n4;
                }
            }
        }
        return n2;
    }

    public static final void a(int n2, boolean bl, v v2) {
        block17: {
            int n3;
            while (true) {
                switch (n2) {
                    case 0: {
                        return;
                    }
                    case 12: {
                        if (!bl) {
                            d d2 = ae.a.a;
                            ae.a((short)(d2.b - 51), d2);
                        }
                        return;
                    }
                    case 11: {
                        if (!bl) {
                            d d3 = ae.a.a;
                            ae.a((short)(d3.b + 51), d3);
                        }
                        return;
                    }
                }
                n3 = n2;
                if (v2.a[n2] != 0) {
                    n3 = v2.a[n2];
                }
                int n4 = n3;
                short s2 = v2.a[n3];
                int n5 = v2.b[s2];
                if (bl) {
                    if (n5 == n2) {
                        v2.b[s2] = 0;
                        if (v2.a == n2) {
                            v2.a = 0;
                        }
                        ((m)v2).a.a(n4, false);
                        return;
                    }
                    if (v2.f) {
                        bl = true;
                        n2 = n5;
                        continue;
                    }
                    break block17;
                }
                if (n5 == 0) break;
                if (s2 != 0) {
                    n3 = n5;
                    if (v2.a[n5] != 0) {
                        n3 = v2.a[n5];
                    }
                    if (n3 == n4) break block17;
                }
                ae.a(n5, true, v2);
                if (!v2.f) {
                    bl = false;
                    continue;
                }
                break block17;
                break;
            }
            v2.b[s2] = (short)n2;
            v2.a = n2;
            v2.b = Integer.MAX_VALUE;
            ((m)v2).a.a(n3, true);
        }
    }

    private static void a(int n2, boolean n3) {
        try {
            b = true;
            c = n2 % 32 + 1;
            d = (byte)(n2 / 32);
            a = RecordStore.openRecordStore((String)"DataStore", (boolean)true);
            b = 0;
            if (n3 != 0) {
                for (n3 = a.getNumRecords() + 1; n3 <= c; ++n3) {
                    a.addRecord(a, 0, 0);
                }
            } else if (a.getNumRecords() < c) {
                b = false;
                return;
            }
            if ((b = a.getRecord(c)) == null) {
                b = false;
                return;
            }
            while (b < b.length && b[b] != d) {
                b += (b[b + 1] & 0xFF) << 8 | b[b + 2] & 0xFF;
                b += 3;
            }
            n3 = b < b.length ? 1 : 0;
            b = n3;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void a(int n2, int n3, v object) {
        object = ae.a.a;
        if (n2 != object[0] || n3 != object[1]) {
            int[] nArray = ae.a(ae.a.a);
            nArray[0] = n2;
            nArray[1] = n3;
            ae.a(ae.a(n2, n3, (int)object[2]));
            ae.a.a = a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(q q2, d d2) {
        d2 = d2.a;
        d d3 = ae.a();
        synchronized (d3) {
            if (d2.b != null) {
                if (ae.a(d2) || ae.b(d2) && !ae.a.a.b) {
                    ae.b(d2);
                }
                if (d2.a == q2 && d2.b.a != null) {
                    return;
                }
                if (ae.a(d2.b) != 300 && d2.b.a != null) {
                    ae.a(d2.b);
                }
            }
            d2.a = q2;
            d2.a = 0;
            if (d2.a != null) {
                d2.b = q2 = q2.a;
                if (q2.a == null) {
                    ae.a(q2);
                }
                ae.a(d2.a, d2);
            } else {
                d2.b = null;
            }
            return;
        }
    }

    public static final boolean a(x object) {
        boolean bl = ((x)object).a[0] == 0;
        if (bl) {
            bl = false;
        } else {
            ah ah2;
            object = ae.a((x)object);
            z z2 = a;
            boolean bl2 = false;
            ah ah3 = ah2;
            ah2 = new ah();
            x x2 = ah3.a;
            x x3 = ae.a(ae.b(ae.a(ae.a("Browser-Launch-Enabled"))));
            short[] sArray = x3.a;
            int n2 = ae.a(x3.a);
            ae.a(sArray, n2, x2);
            ae.a(ah3.a);
            try {
                z2.e = true;
                z2.a = object;
                ae.b(z2);
                bl2 = true;
            }
            catch (Throwable throwable) {}
            bl = bl2;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(d d2) {
        while (d2.a != 2) {
            d2 = d2.a;
        }
        q q2 = d2.b;
        if (q2 != null && q2.a != null) {
            q2.a.equals("audio/x-wav");
            q2.a.equals("audio/midi");
            q2.a.equals("audio/amr");
            d d3 = d2;
            try {
                d d4 = ae.a();
                synchronized (d4) {
                    if (!ae.a(d3)) {
                    } else {
                        d3.b.a.stop();
                        d3.b = true;
                    }
                }
            }
            catch (Throwable throwable) {}
            try {
                d3 = ae.a();
                synchronized (d3) {
                    d2.b = false;
                    q2.a.setMediaTime(0L);
                    return;
                }
            }
            catch (Throwable throwable) {}
        }
    }

    public static int a(int n2) {
        int n3;
        if (n2 >= 48 && n2 <= 57) {
            return n2 - 48 + 17;
        }
        switch (n2) {
            case 42: {
                return 16;
            }
            case 35: {
                return 15;
            }
            case 0: {
                return 0;
            }
        }
        if (n2 >= 48 && n2 <= 57) {
            n3 = n2 - 48 + 17;
        } else {
            switch (n2) {
                case 8: {
                    n3 = 10;
                    break;
                }
                case 35: {
                    n3 = 15;
                    break;
                }
                case 42: {
                    n3 = 16;
                    break;
                }
                default: {
                    n3 = 0;
                }
            }
        }
        int n4 = n3;
        if (n3 != 0) {
            return n3;
        }
        try {
            switch (a.getGameAction(n2)) {
                case 1: {
                    n4 = 1;
                    break;
                }
                case 2: {
                    n4 = 3;
                    break;
                }
                case 5: {
                    n4 = 4;
                    break;
                }
                case 6: {
                    n4 = 2;
                    break;
                }
                case 8: {
                    n4 = 7;
                }
            }
        }
        catch (Exception exception) {}
        return n4;
    }

    public static final int a(int n2, byte[] byArray) {
        byte[] byArray2 = byArray;
        int n3 = -1;
        try {
            ae.a(1, false);
            if (b) {
                n3 = (b[b + 1] & 0xFF) << 8 | b[b + 2] & 0xFF;
                if (byArray.length != n3) {
                    byArray2 = new byte[n3];
                }
                System.arraycopy(b, b + 3, byArray2, 0, n3);
            }
            a.closeRecordStore();
        }
        catch (Exception exception) {}
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(d object) {
        while (((d)object).a != 2) {
            object = ((d)object).a;
        }
        object = ((d)object).b;
        if (object == null) return false;
        if (((q)object).a == null) {
            return false;
        }
        d d2 = ae.a();
        synchronized (d2) {
            if (object == null) return false;
            if (ae.a((q)object) != 400) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(boolean bl, d d2) {
        while (d2.a != 2) {
            d2 = d2.a;
        }
        d d3 = ae.a();
        synchronized (d3) {
            d2.a = bl;
            if (d2.b != null && d2.b.a != null) {
                try {
                    d2 = d2.b.a;
                    bl = bl ? -1 : true;
                    d2.setLoopCount(bl ? 1 : 0);
                }
                catch (Exception exception) {}
            }
            return;
        }
    }

    public static int a(int n2, g g2) {
        while (true) {
            if (g2.a != 5) {
                int n3 = -1;
                try {
                    ae.a(1, false);
                    if (b) {
                        n3 = (b[b + 1] & 0xFF) << 8 | b[b + 2] & 0xFF;
                    }
                    a.closeRecordStore();
                }
                catch (Exception exception) {}
                return n3;
            }
            g2 = g2.a;
        }
    }

    public static final void a(short[] sArray, int n2, x x2) {
        if (x2.a == sArray) {
            return;
        }
        x2.a = null;
        short[] sArray2 = x2.a = new short[n2 + 1];
        for (int i2 = 0; i2 < n2; ++i2) {
            sArray2[i2] = sArray[i2];
            if (sArray[i2] == 0) break;
        }
        x2.a[x2.a.length - 1] = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean a(q q2) {
        try {
            d d2 = ae.a();
            synchronized (d2) {
                q2.a = Manager.createPlayer((InputStream)new ByteArrayInputStream(q2.b.a), (String)q2.a);
                q2.a.realize();
            }
        }
        catch (Throwable throwable) {
            if (q2.a != null) {
                q2.a.close();
            }
            q2.a = null;
        }
        if (q2.a == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c(d d2) {
        try {
            d d3 = ae.a();
            synchronized (d3) {
                VolumeControl volumeControl;
                if (d2.b != null && (volumeControl = (VolumeControl)d2.b.a.getControl("VolumeControl")) != null) {
                    ae.a();
                    volumeControl.setLevel(100 * d2.b * ae.a.a.c >> 16);
                }
                return;
            }
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(q q2) {
        if (q2.a == null) {
            return;
        }
        d d2 = ae.a();
        synchronized (d2) {
            ae.b(q2, ae.a().b);
            try {
                q2.a.close();
            }
            catch (Exception exception) {}
            q2.a = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static short a(d d2) {
        while (true) {
            if (d2.a == 2) {
                d d3 = ae.a();
                synchronized (d3) {
                    return d2.b;
                }
            }
            d2 = d2.a;
        }
    }

    public static short[] a(short[] sArray) {
        short[] sArray2 = new short[4];
        short[] sArray3 = sArray2;
        sArray2[0] = sArray[0];
        sArray3[1] = sArray[1];
        sArray3[2] = sArray[2];
        sArray3[3] = sArray[3];
        return sArray3;
    }

    public static boolean a(int n2, g g2) {
        while (true) {
            if (g2.a != 5) {
                try {
                    ae.a(1, false);
                    a.closeRecordStore();
                }
                catch (Exception exception) {}
                return b;
            }
            g2 = g2.a;
        }
    }

    private static void a(short s2, d d2) {
        if (s2 > 255) {
            s2 = (short)255;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        d2.c = d2.b = s2;
        for (s2 = 0; s2 <= 0; s2 = (short)(s2 + 1)) {
            ae.c(d2.a[0].a);
        }
    }

    public static void a(z z2) {
        long l2 = System.currentTimeMillis();
        if (z2.a == -1L) {
            z2.a = l2;
        }
        if (!(z2.c || z2.a || z2.b || z2.f)) {
            ae.a((short)5, (short)0, (short)0, z2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void b(q q2, d d2) {
        synchronized (d2) {
            for (int i2 = 0; i2 < a; ++i2) {
                if (d2.a[i2] != q2) continue;
                d2.a[i2] = null;
                break;
            }
            return;
        }
    }

    public static String a(x x2) {
        int n2 = ae.a(x2.a);
        int n3 = 0;
        char[] cArray = new char[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = n3++;
            cArray[i2] = (char)x2.a[n4];
        }
        return new String(cArray);
    }

    public static final int a(short[] sArray, int n2, int n3, int n4, int n5, n n6) {
        int n7;
        int n8;
        while (true) {
            if (n3 > n4) {
                return n5;
            }
            n8 = n3 + n4 >> 1;
            n7 = sArray[n8] & 0xFFFF;
            if (n2 == n7) {
                return n8;
            }
            if (n2 < n7) break;
            n3 = n8 + 1;
        }
        n7 = ae.a(sArray, n2, n3, n8 - 1, n5, n6);
        return n7;
    }

    public static final short b(d d2) {
        return d2.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void d(d d2) {
        d d3 = ae.a();
        synchronized (d3) {
            int n2 = 0;
            while (n2 <= 0) {
                ae.b(d2.a[0].a);
                ++n2;
            }
            return;
        }
    }

    public static int[] a(int[] nArray) {
        int[] nArray2 = new int[3];
        int[] nArray3 = nArray2;
        nArray2[0] = nArray[0];
        nArray3[1] = nArray[1];
        nArray3[2] = nArray[2];
        return nArray3;
    }

    public static x a(String object) {
        char[] cArray = ((String)object).toCharArray();
        object = new short[cArray.length + 1];
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            object[i2] = (short)cArray[i2];
        }
        object[((Object)object).length - 1] = false;
        return new x((short[])object);
    }

    public static void b(z z2) {
        z2.f = true;
        ae.d(ae.a());
        System.gc();
        if (z2.e) {
            try {
                z2.platformRequest(z2.a);
            }
            catch (Exception exception) {}
        }
        z2.notifyDestroyed();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int a(q q2) {
        int n2 = 0;
        d d2 = ae.a();
        synchronized (d2) {
            if (q2.a == null) return n2;
            return q2.a.getState();
        }
    }

    public static String a(String string) {
        new ah();
        return ae.b(string);
    }

    private static void a(int n2, j j2) {
        if (j2.a) {
            Display.getDisplay((MIDlet)ae.a.a).vibrate(0);
            System.currentTimeMillis();
        }
    }

    public static boolean a(int[] nArray) {
        a = new ae(nArray);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean b(d d2) {
        d d3 = ae.a();
        synchronized (d3) {
            return d2.b;
        }
    }

    public static int[] a(int n2, int n3, int n4) {
        int[] nArray = new int[3];
        int[] nArray2 = nArray;
        nArray[0] = n2;
        nArray2[1] = n3;
        nArray2[2] = n4;
        return nArray2;
    }

    public static int b(int n2) {
        if (n2 >= 17 && n2 <= 26) {
            return n2 - 17 + 48;
        }
        switch (n2) {
            case 10: {
                return 8;
            }
            case 15: {
                return 35;
            }
            case 16: {
                return 42;
            }
        }
        return 0;
    }

    public static final void a(v v2) {
        short[] sArray = v2.b;
        for (int i2 = 0; i2 < 33; ++i2) {
            sArray[i2] = 0;
        }
        v2.a = 0;
    }

    public static short a(byte[] byArray, int n2) {
        return (short)((byArray[n2] & 0xFF) << 8 | byArray[n2 + 1] & 0xFF);
    }

    public static ag a() {
        ad ad2 = a;
        if (ad2.a == null) {
            ad2.a = new ag();
        }
        return ad2.a;
    }

    public static final void b(int n2) {
        if (ae.a.a != (n2 = ae.d(n2))) {
            ae.a(n2, false, a);
        }
    }

    public static g a() {
        if (ae.a.c == null) {
            ae.a.c = new g(0);
        }
        return ae.a.c;
    }

    public static d a() {
        if (ae.a.a == null) {
            ae.a.a = new d(1);
        }
        return ae.a.a;
    }

    private static String b(String string) {
        String string2 = null;
        try {
            string2 = a.getAppProperty(string);
        }
        catch (Exception exception) {}
        if (string2 == null) {
            string2 = "NULL";
        }
        return string2;
    }

    public static void a(boolean bl) {
        ae.a().a = bl;
        if (bl) {
            ae.d(ae.a());
        }
    }

    public static n a() {
        return ((m)ae.a.a).a;
    }

    public static g b() {
        ad ad2 = a;
        if (ad2.a == null) {
            ad2.a = new g(5);
        }
        return ad2.a;
    }

    public static g c() {
        ad ad2 = a;
        if (ad2.b == null) {
            ad2.b = new g(4);
        }
        return ad2.b;
    }

    public static af a() {
        ad ad2 = a;
        if (ad2.a == null) {
            ad2.a = new af();
        }
        return ad2.a;
    }

    public static final void b(int n2, int n3, v v2) {
        ae.a(v2);
        v2.a[n2] = (short)n3;
    }

    public static void a() {
        v v2 = ae.a.a;
        if (!v2.e) {
            v2.e = true;
        }
        ae.b(a);
    }

    public static final void c(int n2) {
        ae.a(ae.d(n2), true, a);
    }

    public static void a(byte[] byArray, byte[] byArray2, int n2, int n3) {
        System.arraycopy(byArray2, n2, byArray, 0, n3);
    }

    public static void a(short[] sArray, short[] sArray2, int n2) {
        System.arraycopy(sArray, 0, sArray2, 0, n2);
    }

    public static int a(short[] sArray) {
        int n2 = 0;
        while (sArray[n2] != 0) {
            ++n2;
        }
        return n2;
    }

    public static final d a(d d2) {
        return d2.a[0];
    }

    public static x a(short[] sArray) {
        return new x(sArray);
    }

    public static final void a(g g2) {
        ae.a(0, g2.a);
    }

    public static final int a(int[] nArray) {
        return nArray[1];
    }

    public static final int b(int[] nArray) {
        return nArray[0];
    }

    public static short[] a(x x2) {
        return x2.a;
    }

    public static int[] a() {
        return ae.a.a;
    }

    public static int c(int n2) {
        return n2 << 16;
    }

    public static final int a(aa aa2) {
        return aa2.getHeight();
    }

    public static final int b(aa aa2) {
        return aa2.getWidth();
    }

    public static m a() {
        return (m)ae.a.a;
    }

    public static long a() {
        return System.currentTimeMillis();
    }

    static {
        a = new Object();
        a = 50;
        a = true;
        short[] sArray = new short[2];
        short[] sArray2 = sArray;
        sArray[0] = -1;
        sArray2[1] = 0;
        short[] sArray3 = new short[4];
        sArray2 = sArray3;
        sArray3[0] = -1;
        sArray2[1] = -1;
        sArray2[2] = -1;
        sArray2[3] = -1;
        a = (short)Math.max(Math.max(Math.max(16, 16), 16), 1);
        short[] sArray4 = new short[4];
        sArray2 = sArray4;
        sArray4[0] = -1;
        sArray2[1] = -1;
        sArray2[2] = -1;
        sArray2[3] = -1;
        a = new byte[0];
        a = null;
        b = null;
        b = -1;
        c = -1;
        d = -1;
        b = false;
        short[] sArray5 = new short[7];
        sArray2 = sArray5;
        sArray5[0] = -1;
        sArray2[1] = -1;
        sArray2[2] = 3;
        sArray2[3] = -1;
        sArray2[4] = -1;
        sArray2[5] = -1;
        sArray2[6] = -1;
        short[] sArray6 = new short[2];
        sArray2 = sArray6;
        sArray6[0] = -1;
        sArray2[1] = 0;
    }
}

