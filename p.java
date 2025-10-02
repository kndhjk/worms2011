/*
 * Decompiled with CFR 0.152.
 */
import com.ea.sdk.SDKMIDlet;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class p {
    private static final byte a = (byte)8;
    private static final byte b = (byte)(0 + a + 6);
    private int a;
    private int b;
    private String[] a;
    private short[] a;
    private short[] b;
    private short[] c;
    private int[] a;
    private String[] b;
    private String[] c;
    private short[] d;
    private c[] a;
    private Object[] a;
    private int c;
    private boolean a;
    private int d;
    private boolean b;
    private int e;
    private int f;
    private int g;
    private int h;
    private String a;
    private e a;
    private e b;
    private short a;
    private short b;
    private int i;
    private int j;
    private int k;
    private short[] e;
    private short[] f;
    private short[] g = 0;
    private short[] h;
    private String b;
    private c a;
    private c b;
    private c c;
    private boolean c;
    private boolean d;
    private int l = 0;
    private int m;
    private int n;
    private int o = 0;
    private int p;
    private int q = 6;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean e;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private short[][] a;
    private short[][] b;
    private short[] i;
    private short[][] c = true;
    private String[][] a;
    private c[] b = true;
    private c d = true;
    private int C;
    private int D;
    private c e;
    private c f = 0;
    private e[] a = (short)-1;
    private int E = 0;

    public p(int n2, int n3) {
        this.b = (short)-1;
        this.b = n2;
        this.a = n3;
    }

    public final void a(byte[] byArray) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = 2;
        int n8 = byArray[1];
        this.a = new String[n8];
        this.a = new short[n8];
        this.b = new short[n8];
        this.c = new short[n8];
        for (n6 = 0; n6 < n8; ++n6) {
            n5 = n7 + 1;
            n4 = byArray[n7];
            this.a[n6] = new String(byArray, n5, n4);
            n7 = n5 + n4;
        }
        n5 = n8 << 1;
        n6 = n8 << 2;
        for (n4 = 0; n4 < n8; ++n4) {
            this.a[n4] = q.a(byArray, n7);
            this.b[n4] = q.a(byArray, n7 + n5);
            this.c[n4] = q.a(byArray, n7 + n6);
            n7 += 2;
        }
        n5 = n7 + n6;
        for (n7 = 0; n7 < this.a.length; ++n7) {
            this.d[n7] = q.a(byArray, n5);
            n5 += 2;
        }
        int n9 = n5 + 1;
        n5 = byArray[n5];
        this.a = new short[n5][];
        this.b = new short[n5][];
        for (n3 = 0; n3 < n8; ++n3) {
            for (n2 = 0; n2 < n5; ++n2) {
                n4 = q.a(byArray, n9);
                n6 = q.a(byArray, n9 + 2);
                n9 += 4;
                if (n4 == -1 || n6 == -1) continue;
                if (this.a[n2] == null) {
                    this.a[n2] = new short[n8];
                    this.b[n2] = new short[n8];
                    for (n7 = 0; n7 < n8; ++n7) {
                        this.a[n2][n7] = -1;
                        this.b[n2][n7] = -1;
                    }
                }
                this.a[n2][n3] = n4;
                this.b[n2][n3] = n6;
            }
        }
        n2 = n9 + 1;
        n3 = byArray[n9];
        this.i = new short[n3];
        this.c = new short[n3][];
        this.a = new String[n3][];
        for (n9 = 0; n9 < n3; ++n9) {
            n5 = n2 + 1;
            n7 = byArray[n2];
            short[] sArray = this.i;
            sArray[n9] = n4 = (int)q.a(byArray, n5);
            n2 = n5 + 2;
            this.c[n9] = new short[n7];
            this.a[n9] = new String[n7];
            for (n5 = 0; n5 < n7; ++n5) {
                this.c[n9][n5] = q.a(byArray, n2);
                int n10 = n2 + 2;
                n2 = n10 + 1;
                n4 = byArray[n10];
                this.a[n9][n5] = new String(byArray, n2, n4);
                n2 += n4;
            }
        }
    }

    public final void a(Object[] objectArray) {
        this.a = objectArray;
        Object object = ae.a().a.b;
        q.a(objectArray[0]);
        q.b();
        this.D = q.b() - q.a();
        q.a(object);
    }

    public final boolean a() {
        if (this.a == null) {
            this.b();
        }
        boolean bl = this.c != 0;
        return bl;
    }

    private void b() {
        Vector<Short> vector;
        Vector<String> vector2;
        int n2;
        int n3;
        String string = "MG_Impl";
        String string2 = SDKMIDlet.a("MG_Impl");
        if (string2 == null) {
            this.c = 0;
            return;
        }
        String string3 = string2.toLowerCase();
        if (string3.equals("static")) {
            this.c = 1;
        } else {
            if (string3.equals("wapstatic")) {
                // empty if block
            }
            if (string3.equals("wap")) {
                this.c = 2;
            } else if (string3.equals("wapstatic")) {
                this.c = 3;
            } else {
                this.c = 0;
                return;
            }
        }
        string = "MG_PRODUCTS";
        String string4 = SDKMIDlet.a("MG_PRODUCTS");
        if (string4 == null || string4.length() == 0) {
            this.c = 0;
            return;
        }
        int n4 = 0;
        int n5 = -1;
        block0: do {
            String string5 = (n3 = string4.indexOf(44, n5 + 1)) == -1 ? string4.substring(n5 + 1) : string4.substring(n5 + 1, n3);
            n5 = n3;
            if (string5.startsWith("MGPANEL") && string5.length() == "MGPANEL".length() + 1 && string5.charAt(string5.length() - 1) >= '0' && string5.charAt(string5.length() - 1) <= '9') {
                int n6;
                int n7 = string5.charAt(string5.length() - 1) - 48;
                string = "MG_MGPANEL" + n7;
                String string6 = SDKMIDlet.a(string);
                if (string6 == null || n7 >= this.i.length) continue;
                n2 = 0;
                int n8 = -1;
                do {
                    String string7 = (n6 = string6.indexOf(44, n8 + 1)) == -1 ? string6.substring(n8 + 1) : string6.substring(n8 + 1, n6);
                    n8 = n6;
                    for (int i2 = 0; i2 < this.a[n7].length; ++i2) {
                        if (!this.a[n7][i2].equals(string7)) continue;
                        n2 = 1;
                    }
                    if (n2 == 0) continue;
                    ++n4;
                    continue block0;
                } while (n6 != -1);
                continue;
            }
            boolean bl = false;
            for (int i3 = 0; i3 < this.a.length; ++i3) {
                if (!this.a[i3].equals(string5)) continue;
                bl = true;
                break;
            }
            if (!bl) continue;
            ++n4;
        } while (n3 != -1);
        if (n4 == 0) {
            this.c = 0;
        }
        this.a = new int[n4];
        this.b = new String[n4];
        this.c = new String[n4];
        int n9 = -1;
        int n10 = 0;
        Vector<String> vector3 = vector2;
        vector2 = new Vector<String>();
        Vector<Short> vector4 = vector;
        vector = new Vector<Short>();
        for (n2 = 0; n2 < this.a.length; ++n2) {
            int n11 = string4.indexOf(44, n9 + 1);
            String string8 = n11 == -1 ? string4.substring(n9 + 1) : string4.substring(n9 + 1, n11);
            n9 = n11;
            if (string8.startsWith("MGPANEL") && string8.length() == "MGPANEL".length() + 1 && string8.charAt(string8.length() - 1) >= '0' && string8.charAt(string8.length() - 1) <= '9') {
                n11 = string8.charAt(string8.length() - 1) - 48;
                string = "MG_MGPANEL" + n11;
                string8 = SDKMIDlet.a(string);
                if (string8 != null && n11 < this.i.length) {
                    int n12;
                    vector3.setSize(0);
                    vector4.setSize(0);
                    n3 = -1;
                    do {
                        String string9 = (n5 = string8.indexOf(44, n3 + 1)) == -1 ? string8.substring(n3 + 1) : string8.substring(n3 + 1, n5);
                        n3 = n5;
                        for (n12 = 0; n12 < this.a[n11].length; ++n12) {
                            if (!this.a[n11][n12].equals(string9) || vector3.contains(string9)) continue;
                            vector3.addElement(string9);
                            vector4.addElement(new Short(this.c[n11][n12]));
                        }
                    } while (n5 != -1);
                    if (vector3.size() != 0) {
                        this.a[n2] = n11 | Integer.MIN_VALUE;
                        n12 = vector3.size();
                        this.a[n11] = new String[n12];
                        this.c[n11] = new short[n12];
                        for (int i4 = 0; i4 < n12; ++i4) {
                            this.a[n11][i4] = vector3.elementAt(i4).toString();
                            this.c[n11][i4] = (Short)vector4.elementAt(i4);
                        }
                        if (n10 >= n12) continue;
                        n10 = n12;
                        continue;
                    }
                    --n2;
                    continue;
                }
                --n2;
                continue;
            }
            this.a[n2] = -2;
            this.b[n2] = null;
            this.c[n2] = null;
            for (int i5 = 0; i5 < this.a.length; ++i5) {
                if (!this.a[i5].equals(string8)) continue;
                this.a[n2] = i5;
                String string10 = "MG_BUYURI_" + string8;
                this.b[n2] = SDKMIDlet.a(string10);
                string10 = "MG_CATURI_" + string8;
                this.c[n2] = SDKMIDlet.a(string10);
                if (this.b[n2] != null) {
                    this.b[n2] = this.b[n2].trim();
                }
                if (this.c[n2] == null) break;
                this.c[n2] = this.c[n2].trim();
                break;
            }
            if (this.a[n2] != -2) continue;
            --n2;
        }
        this.b = new c[n10];
        this.a = new e[n10];
    }

    public final boolean b() {
        return this.a;
    }

    public final void a() {
        switch (this.f) {
            case 3: {
                if ((this.d & 0x804) != 0 && this.a.length > 0) {
                    --this.e;
                    if (this.e < 0) {
                        this.e = this.a.length - 1;
                    }
                    this.a(this.e);
                } else if ((this.d & 0x2008) != 0 && this.a.length > 0) {
                    ++this.e;
                    this.e %= this.a.length;
                    this.a(this.e);
                } else if ((this.d & 0x80040) != 0) {
                    this.a = false;
                    this.f();
                } else if ((this.d & 0x201) != 0) {
                    --this.i;
                    this.E = 0;
                    if (this.i < 0) {
                        this.i = this.C - 1;
                    }
                    this.c();
                } else if ((this.d & 0x8002) != 0) {
                    ++this.i;
                    this.i %= this.C;
                    this.E = 0;
                    this.c();
                } else if ((this.d & 0x1030) != 0) {
                    Object object = null;
                    if (this.c == 2 || this.c == 3) {
                        object = "MG_BUYURI_" + this.a[this.a[this.e] & Integer.MAX_VALUE][this.i];
                        object = SDKMIDlet.a((String)object);
                    }
                    if (object == null) {
                        if (this.c == 2) break;
                        this.e = null;
                        object = this.a[6];
                        this.f = object;
                        this.g = this.f;
                        this.f = 2;
                    } else {
                        this.a = object;
                        this.g = this.f;
                        this.e();
                    }
                }
                if (this.i < this.j) {
                    this.j = this.i;
                    this.E = 0;
                }
                if (this.i < this.j + this.k) break;
                this.j = this.i - this.k + 1;
                this.E = 0;
                break;
            }
            case 0: {
                if ((this.d & 0x804) != 0) {
                    --this.e;
                    if (this.e < 0) {
                        this.e = this.a.length - 1;
                    }
                    this.a(this.e);
                    break;
                }
                if ((this.d & 0x2008) != 0) {
                    ++this.e;
                    this.e %= this.a.length;
                    this.a(this.e);
                    break;
                }
                if (((this.d & 0x201) != 0 || (this.d & 0x8002) != 0) && this.c && this.d) {
                    if (this.l == 1) {
                        this.l = 0;
                        break;
                    }
                    this.l = 1;
                    break;
                }
                if ((this.d & 0x80040) != 0) {
                    this.a = false;
                    this.f();
                    break;
                }
                if ((this.d & 0x1030) == 0) break;
                if (this.l == 0) {
                    this.a = this.b[this.e];
                    this.g = this.f;
                    this.e();
                    break;
                }
                if (this.l != 1) break;
                if (this.c == 1 || this.c == 3 && (this.c[this.e] == null || this.c[this.e].compareTo("") == 0)) {
                    c c2;
                    this.e = null;
                    this.f = c2 = this.a[6];
                    this.g = this.f;
                    this.f = 2;
                    break;
                }
                this.a = this.c[this.e];
                this.g = this.f;
                this.e();
                break;
            }
            case 1: {
                if ((this.d & 0x80040) != 0) {
                    c c3;
                    this.e = c3 = this.a[5];
                    this.f = c3 = this.a[6];
                    this.f = this.g;
                    break;
                }
                if ((this.d & 0x20) == 0) break;
                this.a(this.a(this.a));
                break;
            }
            case 2: {
                c c4;
                if ((this.d & 0x80040) == 0) break;
                this.e = c4 = this.a[5];
                this.f = c4 = this.a[6];
                this.f = this.g;
            }
        }
        this.d = 0;
    }

    private void c() {
        c c2;
        c c3;
        String string;
        boolean bl = this.c == 2 && SDKMIDlet.a(string = "MG_BUYURI_" + this.a[this.a[this.e] & Integer.MAX_VALUE][this.i]) == null;
        this.e = bl ? null : (c3 = this.a[5]);
        this.f = c2 = this.a[6];
    }

    public final void b(o o2) {
        this.a(o2);
        switch (this.f) {
            case 0: {
                int n2;
                int n3;
                --this.q;
                if (this.q < 0) {
                    this.q = 6;
                }
                if (this.e) {
                    o2.a(-16757361);
                    q.a(this.a[4]);
                    o2.c(0, 0, this.b, this.n);
                    q.a(this.a[9], this.b >> 1, 1, 17);
                }
                if (this.a != null) {
                    o2.a(this.a, this.b >> 1, this.r, 17);
                    if (this.b != null) {
                        o2.a(this.b, (this.b - this.a.a.a >> 1) + this.a, this.r + this.b, 20);
                    }
                    if (this.a.length > 1) {
                        this.a(o2, (this.b - this.a.a.a >> 2) - (a >> 1), this.s);
                        this.b(o2, this.b - (this.b - this.a.a.a >> 2) + (a >> 1), this.s);
                    }
                    q.a(this.a[0]);
                    q.a(this.b, this.h, 1, this.h[0], this.b >> 1, this.o, 17);
                    q.a(this.a, this.g, 1, this.g[0], this.b >> 1, this.t, 17);
                } else {
                    q.a(this.a[0]);
                    q.a(this.b, this.b >> 1, this.r, 17);
                    q.a(this.a, this.g, 1, this.g[0], this.b >> 1, this.t, 17);
                    if (this.a.length > 1) {
                        this.a(o2, 1, this.s);
                        this.b(o2, this.b - 1, this.s);
                    }
                }
                if (this.c) {
                    n3 = this.u;
                    int n4 = this.p;
                    c c2 = this.a[10];
                    n2 = this.l == 0 ? 1 : 0;
                    this.a(o2, n3, n4, c2, n2 != 0);
                }
                if (!this.d) break;
                n2 = this.v;
                n3 = this.p;
                c c3 = this.c;
                boolean bl = this.l == 1;
                this.a(o2, n2, n3, c3, bl);
                break;
            }
            case 3: {
                int n5;
                int n6;
                --this.q;
                if (this.q < 0) {
                    this.q = 6;
                }
                if (this.e) {
                    o2.a(-16757361);
                    o2.c(0, 0, this.b, this.n);
                    q.a(this.a[4]);
                    q.a(this.d, this.b >> 1, 1, 17);
                }
                int n7 = this.z;
                q.a(this.a[1]);
                for (int i2 = this.j; i2 < this.j + this.k; ++i2) {
                    if (i2 == this.i) {
                        q.a(this.a[2]);
                    }
                    n6 = this.D;
                    if (this.a[i2] != null) {
                        n6 = this.a[i2].a.a;
                        o2.a(this.a[i2], this.A, n7 + (this.B >> 1), 6);
                    }
                    n5 = this.A + n6 + 4;
                    n6 = n7 + (this.B >> 1) - (q.b() - q.a() >> 1);
                    o2.e(n5, n6, this.b - this.A - n5, q.b() - q.a());
                    if (i2 == this.i) {
                        q.a(this.b[i2], n5 - (this.E >> 1), n6, 20);
                        ++this.E;
                        if (n5 - (this.E >> 1) + q.a(this.b[i2]) < this.b - this.A) {
                            this.E = 0;
                        }
                    } else {
                        q.a(this.b[i2], n5, n6, 20);
                    }
                    o2.e(0, 0, this.b, this.a);
                    n7 += this.B;
                    if (i2 != this.i) continue;
                    q.a(this.a[1]);
                }
                if (this.j > 0) {
                    n5 = this.b >> 1;
                    n6 = this.y - (this.q >> 1);
                    o2.a(-16757361);
                    o2.a(n5, n6, n5 - a, n6 + a, n5 + a, n6 + a);
                }
                if (this.j + this.k < this.C) {
                    n5 = this.b >> 1;
                    n6 = this.x - (6 - (this.q >> 1));
                    o2.a(-16757361);
                    o2.a(n5, n6, n5 - a, n6 - a, n5 + a, n6 - a);
                }
                if (this.a.length <= 1) break;
                this.a(o2, this.A - a >> 1, this.a >> 1);
                this.b(o2, this.b - (this.A - a >> 1), this.a >> 1);
                break;
            }
            case 2: {
                q.a(this.a[0]);
                q.a(this.a[0], this.e, 1, this.e[0], this.b >> 1, this.a - this.w >> 1, 3);
                break;
            }
            case 1: {
                q.a(this.a[0]);
                q.a(this.a[4], this.f, 1, this.f[0], this.b >> 1, this.a - this.w >> 1, 3);
            }
        }
        if (this.b) {
            q.a(this.a[3]);
            if (this.e != null) {
                q.a(this.e, 2, this.a + q.a() - 2, 36);
            }
            if (this.f != null) {
                q.a(this.f, this.b - 2, this.a + q.a() - 2, 40);
            }
        }
    }

    public final byte a(int n2) {
        if (this.a) {
            this.d |= n2;
        }
        return 0;
    }

    protected void a(o o2) {
        o2.e(0, 0, this.b, this.a);
        o2.a(-1);
        o2.c(0, 0, this.b, this.a);
    }

    public final void b(String string) {
        if (this.a == null) {
            this.b();
        }
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = q.a((int)this.d[i2], null);
        }
        this.b = string;
        this.e = 0;
        this.a = true;
        this.f = 0;
        this.a(0);
        q.a(this.a[0]);
        this.e = q.a(this.a[0], null, this.b - 10, (short)124);
        this.f = q.a(this.a[4], null, this.b - 10, (short)124);
    }

    private void a(int n2) {
        if (this.a[n2] == -1 || (this.a[n2] & Integer.MIN_VALUE) == 0) {
            c c2;
            c c3;
            int n3 = n2;
            p p2 = this;
            p2.h = p2.a[n3];
            if (p2.h != -1) {
                try {
                    p2.a = q.a("/mgi" + p2.a[p2.h].toLowerCase() + ".png");
                }
                catch (Exception exception) {
                    p2.a = null;
                }
                byte by = ae.a().d;
                p2.b = null;
                p2.a = (short)-1;
                p2.b = (short)-1;
                if (p2.a[by] != null && p2.a[by][p2.h] != -1) {
                    try {
                        p2.b = q.a("/mgi" + p2.a[p2.h].toLowerCase() + "_" + ae.a().d + ".png");
                        p2.a = p2.a[by][p2.h];
                        p2.b = p2.b[by][p2.h];
                    }
                    catch (Exception exception) {}
                }
                p2.a = q.a((int)p2.c[p2.h], null);
                p2.c = q.a((int)p2.b[p2.h], null);
                p2.b = q.a((int)p2.a[p2.h], null);
                switch (p2.c) {
                    case 1: {
                        p2.c = false;
                        p2.d = true;
                        p2.l = 1;
                        break;
                    }
                    case 2: {
                        by = p2.b[n3] != null && p2.b[n3].compareTo("") != 0 ? (byte)1 : 0;
                        p2.c = by;
                        by = p2.c[n3] != null && p2.c[n3].compareTo("") != 0 ? (byte)1 : 0;
                        p2.d = by;
                        if (p2.c) {
                            p2.l = 0;
                            break;
                        }
                        if (p2.d) {
                            p2.l = 1;
                            break;
                        }
                        p2.l = 2;
                        break;
                    }
                    case 3: {
                        p2.d = true;
                        if (p2.b[n3] != null && p2.b[n3].compareTo("") != 0) {
                            p2.c = true;
                            p2.l = 0;
                            break;
                        }
                        p2.c = false;
                        p2.l = 1;
                    }
                }
            } else {
                try {
                    p2.a = q.a("/mgi" + "LOG".toLowerCase() + ".png");
                }
                catch (Exception exception) {
                    p2.b = null;
                    p2.a = (short)-1;
                    p2.b = (short)-1;
                }
                p2.a = p2.a[1];
                p2.c = p2.a[2];
                p2.b = p2.a[3];
                p2.c = false;
                if (p2.c == 2 && (p2.c[n3] == null || p2.c[n3].compareTo("") == 0)) {
                    p2.d = false;
                    p2.l = 2;
                } else {
                    p2.d = true;
                    p2.l = 1;
                }
            }
            p2.e = p2.l != 2 ? (c3 = p2.a[5]) : null;
            p2.f = c2 = p2.a[6];
            p2.p = (p2.b << 2) / 5;
            n3 = p2.a;
            p2.w = 0;
            if (p2.b) {
                q.a(p2.a[3]);
                p2.w = q.b() - q.a();
                n3 -= p2.w;
            }
            int n4 = n3 + -2;
            if (p2.d) {
                n4 -= 5;
                if (p2.l == 1) {
                    q.a(p2.a[2]);
                } else {
                    q.a(p2.a[1]);
                }
                p2.v = n4 -= q.b() - q.a();
                n3 = q.a(p2.c) + 6 + q.b() - q.a() + 6;
                if (n3 > p2.p) {
                    p2.p = n3;
                }
            }
            if (p2.c) {
                n4 -= 5;
                if (p2.l == 0) {
                    q.a(p2.a[2]);
                } else {
                    q.a(p2.a[1]);
                }
                p2.u = n4 -= q.b() - q.a();
                n3 = q.a(p2.a[10]) + 6 + q.b() - q.a() + 6;
                if (n3 > p2.p) {
                    p2.p = n3;
                }
            }
            if (p2.d && p2.c) {
                p2.u = n4 -= 2;
            }
            n4 -= 2;
            if (p2.a != null) {
                q.a(p2.a[0]);
                p2.g = q.a(p2.a, null, p2.b - 2, (short)124);
                p2.h = q.a(p2.b, null, p2.b - 2, (short)124);
                p2.t = n4 = n4 - (p2.g[0] * q.b() - q.a()) + -5;
                p2.o = n4 -= p2.h[0] * q.b() - q.a();
                p2.r = n4 -= p2.a.a.b;
                p2.s = p2.r + (p2.a.a.b >> 1);
            } else {
                q.a(p2.a[0]);
                p2.g = q.a(p2.a, null, p2.b - (b >> 1), (short)124);
                p2.t = n4 -= p2.g[0] * q.b();
                p2.r = n4 -= q.b();
                p2.s = p2.r + (q.b() - q.a() >> 1);
            }
            int n5 = n4 + -1;
            q.a(p2.a[4]);
            p2.n = q.b() - q.a() + 1 + 1;
            if (n5 >= p2.n) {
                p2.e = true;
                n5 -= p2.n;
            } else {
                p2.e = false;
            }
            if (n5 > 0) {
                int n6 = n5 * 3 / 10;
                n3 = n5 >> 2;
                p2.r -= n5 - n6;
                p2.s -= n5 - n6;
                p2.t -= n5 - n6 - n3;
                p2.o -= n5 - n6 - n3;
                n4 = n5 >> 2;
                p2.u -= n5 - n6 - n3 - n4;
                p2.v -= n5 - n6 - n3 - n4;
            }
            this.f = 0;
            return;
        }
        this.m = this.a[n2] & Integer.MAX_VALUE;
        for (n2 = 0; n2 < this.a.length; ++n2) {
            this.a[n2] = null;
        }
        for (n2 = 0; n2 < this.c[this.m].length; ++n2) {
            this.b[n2] = q.a((int)this.c[this.m][n2], null);
            try {
                this.a[n2] = q.a("/mgc" + this.a[this.m][n2].toLowerCase() + ".png");
                continue;
            }
            catch (Exception exception) {}
        }
        this.d = q.a((int)this.i[this.m], null);
        this.i = 0;
        this.j = 0;
        this.E = 0;
        this.C = this.c[this.m].length;
        this.c();
        this.d();
        this.f = 3;
    }

    private void d() {
        int n2 = this.a;
        if (this.b) {
            q.a(this.a[3]);
            this.w = q.b() - q.a();
            n2 -= this.w;
        }
        q.a(this.a[4]);
        this.n = q.b() - q.a() + 1 + 1;
        this.e = true;
        int n3 = n2 + -2 + -1 - (a << 1) + -8 - this.n;
        q.a(this.a[0]);
        n2 = q.b() - q.a();
        this.B = this.a[0] != null && this.a[0].a.b > n2 ? (int)this.a[0].a.b : n2;
        this.B += 4;
        n2 = n3 / this.B;
        if (n2 >= this.C) {
            n2 = this.C;
        }
        this.k = n2;
        if ((n3 -= this.k * (this.B + 1)) < 0) {
            n3 = 0;
        }
        this.x = this.a - this.w - 2 - (n3 >> 2) + 3;
        this.y = this.n + 1 + (n3 >> 2) + 3;
        this.z = this.n + 1 + a + (n3 >> 1) + 3 + 1;
        n3 = 0;
        q.a(this.a[1]);
        for (int i2 = 0; i2 < this.C; ++i2) {
            if (i2 == this.i) {
                q.a(this.a[2]);
            }
            n2 = q.a(this.b[i2]);
            if (i2 == this.i) {
                q.a(this.a[1]);
            }
            n2 += 4;
            n2 = this.a[i2] == null ? (n2 += this.D) : (n2 += this.a[i2].a.a);
            if (n2 <= n3) continue;
            n3 = n2;
        }
        this.A = this.b - n3 >> 1;
        if (this.A <= a + 6 + 1) {
            this.A = a + 6 + 1;
        }
    }

    public void a(String string) {
        String string2 = string;
        ae.a();
        ae.a(ae.a(ae.a(ae.a(new String(string2)))));
    }

    private String a(String string) {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer = new StringBuffer(string);
        if (string.indexOf(63) == -1) {
            stringBuffer2.append('?');
        } else {
            stringBuffer2.append('&');
        }
        stringBuffer2.append("ctx");
        stringBuffer2.append('=');
        stringBuffer2.append(this.b);
        stringBuffer2.append('&');
        stringBuffer2.append("lng");
        stringBuffer2.append('=');
        stringBuffer2.append(new String(ae.a().a[ae.a().d]));
        for (int i2 = 1; i2 < 10; ++i2) {
            string = SDKMIDlet.a("MG_REPORTING_NAME" + i2);
            if (string == null) continue;
            stringBuffer2.append('&');
            stringBuffer2.append(string);
            stringBuffer2.append('=');
            stringBuffer2.append(SDKMIDlet.a("MG_REPORTING_VALUE" + i2));
        }
        return stringBuffer2.toString();
    }

    private void e() {
        c c2;
        ae.a();
        this.e = c2 = this.a[7];
        this.f = c2 = this.a[8];
        this.f = 1;
    }

    private void f() {
        int n2;
        this.e = null;
        this.f = null;
        this.g = null;
        this.a = null;
        this.b = null;
        this.a = null;
        this.b = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        for (n2 = 0; n2 < this.a.length; ++n2) {
            this.a[n2] = null;
        }
        for (n2 = 0; n2 < this.b.length; ++n2) {
            this.b[n2] = null;
        }
    }

    private void a(o o2, int n2, int n3) {
        int n4 = n2 + (this.q >> 1);
        o2.a(-16757361);
        for (n2 = 0; n2 <= a; ++n2) {
            o2.a(n4 + n2, n3 - n2, n4 + n2, n3 + n2);
        }
        o2.a(-9462329);
        o2.a(n4, n3, n4 + a, n3 - a);
        o2.a(n4, n3, n4 + a, n3 + a);
        o2.a(n4 + a, n3 - a, n4 + a, n3 + a);
    }

    private void b(o o2, int n2, int n3) {
        int n4 = n2 - (this.q >> 1);
        o2.a(-16757361);
        for (n2 = 0; n2 <= a; ++n2) {
            o2.a(n4 - n2, n3 - n2, n4 - n2, n3 + n2);
        }
        o2.a(-9462329);
        o2.a(n4, n3, n4 - a, n3 - a);
        o2.a(n4, n3, n4 - a, n3 + a);
        o2.a(n4 - a, n3 - a, n4 - a, n3 + a);
    }

    private void a(o o2, int n2, int n3, c c2, boolean n4) {
        int n5 = 0;
        if (n4 != 0) {
            q.a(this.a[2]);
            if (this.a[2] == this.a[1]) {
                n5 = 1;
            }
        } else {
            q.a(this.a[1]);
        }
        int n6 = q.b() - q.a();
        n4 = n6 + 3 + 2;
        int n7 = this.b - n3 >> 1;
        o2.a(-16777216);
        o2.c(n7, n2, n3, n4);
        o2.a(-16757361);
        o2.c(n7, n2, n3 - 1, n4 - 1);
        o2.a(-9462329);
        o2.a(n7 + 1, n2 + 1, n7 + n3 - 2, n2 + 1);
        o2.a(n7 + 1, n2 + 1, n7 + 1, n2 + n4 - 3);
        if (n5 != 0) {
            o2.a(-1);
            n7 = n7 + (n6 >> 1) + 3;
            n5 = n2 + (n4 >> 1);
            n6 = (n6 >> 1) - 1;
            for (n4 = 0; n4 <= n6; ++n4) {
                o2.a(n7 - n4, n5 - n4, n7 - n4, n5 + n4);
            }
        }
        q.a(c2, this.b >> 1, n2 + 2, 17);
    }

    public final void a(int n2, int n3) {
        int n4 = 0;
        switch (this.f) {
            case 3: {
                int n5;
                if (this.a.length > 1) {
                    n4 = this.A - a >> 1;
                    n5 = this.a >> 1;
                    if (n2 > n4 - 20 && n2 < n4 + 20 && n3 > n5 - 20 && n3 < n5 + 20) {
                        this.d |= 4;
                    }
                    if (n2 > (n4 = this.b - n4) - 20 && n2 < n4 + 20 && n3 > n5 - 20 && n3 < n5 + 20) {
                        this.d |= 8;
                    }
                }
                if (this.j > 0) {
                    n4 = this.b >> 1;
                    n5 = this.y;
                    if (n2 > n4 - 20 && n2 < n4 + 20 && n3 > n5 - 20 && n3 < n5 + 20) {
                        this.d |= 1;
                    }
                }
                if (this.j + this.k < this.C) {
                    n5 = this.x;
                    if (n2 > n4 - 20 && n2 < n4 + 20 && n3 > n5 - 20 && n3 < n5 + 20) {
                        this.d |= 2;
                    }
                }
                if (n2 > this.A && n2 < this.b - this.A && n3 > this.z && n3 < this.z + this.k * this.B) {
                    this.i = this.j + (n3 -= this.z) / this.B;
                    this.d |= 0x10;
                }
                this.c();
                break;
            }
            case 0: {
                int n6;
                if (this.a != null) {
                    if (this.a.length > 1) {
                        n6 = this.b - this.a.a.a >> 2;
                        if (n2 > n6 - 20 && n2 < n6 + 20 && n3 > this.s - 20 && n3 < this.s + 20) {
                            this.d |= 4;
                        }
                        if (n2 > (n6 = this.b - (this.b - this.a.a.a >> 2)) - 20 && n2 < n6 + 20 && n3 > this.s - 20 && n3 < this.s + 20) {
                            this.d |= 8;
                        }
                    }
                } else if (this.a.length > 1) {
                    if (n2 > 1 && n2 < 41 && n3 > this.s - 20 && n3 < this.s + 20) {
                        this.d |= 4;
                    }
                    if (n2 > this.b - 1 - 40 && n2 < this.b - 1 && n3 > this.s - 20 && n3 < this.s + 20) {
                        this.d |= 8;
                    }
                }
                if (this.c) {
                    n6 = q.b() - q.a() + 3 + 2;
                    n4 = this.b - this.p >> 1;
                    if (n2 > n4 && n2 < n4 + this.p && n3 > this.u && n3 < this.u + n6) {
                        this.l = 0;
                        this.d |= 0x10;
                    }
                }
                if (!this.d) break;
                n6 = q.b() - q.a() + 3 + 2;
                n4 = this.b - this.p >> 1;
                if (n2 <= n4 || n2 >= n4 + this.p || n3 <= this.v || n3 >= this.v + n6) break;
                this.l = 1;
                this.d |= 0x10;
            }
        }
        if (this.b) {
            if (this.d || this.f == 3) {
                q.b();
            } else if (this.c || this.f == 3) {
                q.b();
            }
            if (this.e != null && n2 < this.b / 3 && n3 > this.a - this.w) {
                this.d |= 0x20;
            }
            if (this.f != null && n2 > 2 * this.b / 3 && n3 > this.a - this.w) {
                this.d |= 0x40;
            }
        }
    }
}

