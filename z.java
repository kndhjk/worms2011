/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class z
extends MIDlet
implements Runnable {
    private long b;
    public long a;
    public long[] a;
    public int a;
    public volatile boolean a;
    public boolean b = true;
    public volatile boolean c;
    public boolean d;
    public boolean e;
    public String a;
    private long c;
    private long d;
    public volatile boolean f;
    public boolean g;
    public boolean h;
    private Thread a = "";

    public z() {
        this.c = System.currentTimeMillis();
        this.d = System.currentTimeMillis();
        ae.a = this;
        ae.b = this;
    }

    public void startApp() {
        this.b();
    }

    public final void b() {
        if (this.a != -1L) {
            this.b += System.currentTimeMillis() - this.a;
            this.a = -1L;
        }
        if (this.a == null && this.b) {
            this.a = new Thread(this);
            ae.a = new ad();
            new ad().a = this;
            ae.a(ae.a(360, 640, 24));
            ae.a = new m();
            this.a.start();
            return;
        }
        if (this.c || this.a) {
            ae.a((short)6, (short)0, (short)0, this);
        }
    }

    public void pauseApp() {
        ae.a(this);
    }

    public void destroyApp(boolean bl) {
        if (!this.f) {
            this.f = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void run() {
        ae.a = new aa();
        ae.a = false;
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)ae.a);
        Object object = ae.a.a;
        ae.a(ae.b(ae.a), ae.a(ae.a), (v)object);
        this.b = false;
        while (!this.f) {
            long l2;
            int n2;
            int n3;
            long l3 = System.currentTimeMillis();
            Object object2 = ae.a;
            // MONITORENTER : object2
            while (this.a > 0) {
                int n4;
                Object object3 = this.a;
                // MONITORENTER : this.a
                long[] lArray = this.a;
                n3 = (int)(this.a[0] >>> 48);
                n2 = (int)((lArray[0] & 0xFFFFFFFF0000L) >>> 16);
                short s2 = (short)((lArray[0] & 0xFFFF00000000L) >>> 32);
                short s3 = (short)((lArray[0] & 0xFFFF0000L) >>> 16);
                if (this.a > 1) {
                    for (n4 = 0; n4 < 7; ++n4) {
                        lArray[n4] = lArray[n4 + 1];
                    }
                }
                --this.a;
                // MONITOREXIT : object3
                switch (n3) {
                    case 1: {
                        ae.b(n2);
                        break;
                    }
                    case 2: {
                        ae.c(n2);
                        break;
                    }
                    case 3: {
                        if (ae.a.a == n2) break;
                        ae.a(n2, false, ae.a);
                        break;
                    }
                    case 4: {
                        ae.a(n2, true, ae.a);
                        break;
                    }
                    case 5: {
                        this.c = false;
                        this.a = true;
                        v v2 = ae.a.a;
                        object3 = v2;
                        if (v2.c) {
                            object3.c = false;
                            object3.d = true;
                            for (n4 = 0; n4 < 33; ++n4) {
                                ae.a((int)object3.b[n4], true, (v)object3);
                            }
                        }
                        v v3 = ae.a.a;
                        object3 = v3;
                        if (v3.b) break;
                        object3.b = true;
                        object3.a[1] = System.currentTimeMillis();
                        m m2 = (m)object3;
                        object3 = m2;
                        if (m2.a) break;
                        object3.a.c();
                        object3.a = true;
                        break;
                    }
                    case 6: {
                        this.c = System.currentTimeMillis();
                        if (!this.a) break;
                        v v4 = ae.a.a;
                        object3 = v4;
                        if (!v4.c) {
                            object3.c = true;
                            object3.d = true;
                            af af2 = ae.a();
                            object3 = af2;
                            if (af2.a) {
                                object3.a = false;
                                object3.a = true;
                            }
                        }
                        v v5 = ae.a.a;
                        object3 = v5;
                        if (v5.b) {
                            long l4;
                            object3.b = false;
                            object3.a[0] = l4 = object3.a[0] + (System.currentTimeMillis() - object3.a[1]);
                            object3.a[1] = 0L;
                            m m3 = (m)object3;
                            if (m3.a) {
                                m3.a += System.currentTimeMillis() - m3.b;
                                t.a(0);
                                m3.a = false;
                                m3.a.b();
                            }
                            int n5 = ae.b(ae.a);
                            int n6 = ae.a(ae.a);
                            int[] nArray = ae.a(ae.a.a);
                            n3 = nArray[0] == n5 && nArray[1] == n6 ? 1 : 0;
                            if (n3 == 0) {
                                ae.a(n5, n6, (v)object3);
                            }
                        }
                        ae.a();
                        ae.a(this.d);
                        try {
                            Thread.sleep(1L);
                        }
                        catch (InterruptedException interruptedException) {}
                        this.a = false;
                        this.g = true;
                        break;
                    }
                    case 7: {
                        ae.a = true;
                        ae.a.a.d = true;
                        break;
                    }
                    case 8: {
                        v v6 = ae.a.a;
                        object3 = v6;
                        if (!v6.e) {
                            object3.e = true;
                        }
                        ae.b(ae.a);
                        break;
                    }
                    case 10: {
                        af af3 = ae.a();
                        object3 = af3;
                        if (!af3.a || object3.a[0] == s2 && object3.a[1] == s3) break;
                        object3.a[0] = s2;
                        object3.a[1] = s3;
                        ((m)ae.a.a).a.b();
                        break;
                    }
                    case 9: {
                        af af4 = ae.a();
                        object3 = af4;
                        if (!af4.a) break;
                        object3.a[0] = s2;
                        object3.a[1] = s3;
                        ((m)ae.a.a).a.a((int)s2, s3);
                        break;
                    }
                    case 11: {
                        if (!ae.a().a) break;
                        ((m)ae.a.a).a.b((int)s2, s3);
                        break;
                    }
                    case 12: {
                        ae.a((int)s2, (int)s3, ae.a.a);
                        break;
                    }
                }
            }
            // MONITOREXIT : object2
            if (this.a) {
                if (this.h && ae.a.isShown()) {
                    this.h = false;
                    this.b();
                }
                try {
                    Thread.sleep(100);
                }
                catch (Exception exception) {}
                continue;
            }
            object = ae.a;
            // MONITORENTER : object
            aa aa2 = ae.a;
            n2 = this.a == -1L ? (int)(System.currentTimeMillis() - this.b) : (int)(this.a - this.b);
            n3 = n2;
            n2 -= aa2.a;
            object2 = ae.a.a;
            int n7 = ((v)object2).b;
            if (((v)object2).a != 0) {
                if (n7 == Integer.MAX_VALUE) {
                    n7 = -350;
                } else if ((n7 += n2) > 150) {
                    n7 = 0;
                }
            }
            ((v)object2).b = n7;
            object2 = (m)object2;
            t t2 = ((m)object2).a;
            ((m)object2).b = l2 = System.currentTimeMillis();
            ((m)object2).a.a(l2 - ((m)object2).a);
            ((v)object2).d = true;
            t2.a();
            aa2.a = n3;
            ae.a = true;
            // MONITOREXIT : object
            if (this.f) {
                return;
            }
            if (l3 - this.d > 0L) {
                ae.a = true;
                ae.a.a.d = true;
                this.d = l3;
            }
            if (l3 - this.c < 2000L) {
                ae.a = true;
                ae.a.a.d = true;
            }
            if (ae.a && ae.a.a.d) {
                ae.a.repaint();
                try {
                    ae.a.serviceRepaints();
                }
                catch (Exception exception) {}
            }
            n2 = (int)(System.currentTimeMillis() - l3);
            l3 = ae.a - (long)n2;
            try {
                if (l3 < 1L) {
                    l3 = 1L;
                }
                Thread.sleep(l3);
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}

