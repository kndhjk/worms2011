/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class s
implements k {
    public boolean a;
    public byte a;
    public short a;
    public byte[] a;
    public short[] a;

    private boolean a() {
        if (this.a >= 60 && this.a <= 65) {
            return true;
        }
        return this.a < 80 || this.a > 96;
    }

    final void a() {
        int n2;
        int n3;
        if (this.a()) {
            n3 = y.u[this.a - 60];
            n2 = y.v[this.a - 60];
        } else {
            n3 = y.w[this.a - 80];
            n2 = y.x[this.a - 80];
        }
        if (n3 != 0) {
            this.a = new byte[n3];
        }
        if (n2 != 0) {
            this.a = new short[n2];
        }
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    final void a(b b2) {
        this.a = b2.a();
        if (this.a()) {
            this.a = b2.read() > 0;
            this.a[0] = b2.a();
            this.a[0] = (byte)b2.read();
        } else {
            this.a = false;
            this.a[1] = b2.a();
        }
        int n2 = 0;
        block24: do {
            switch (n2 == 0 ? this.a : n2) {
                case 60: {
                    this.a[3] = b2.a();
                    this.a[4] = b2.a();
                    this.a[1] = (byte)b2.read();
                    this.a[5] = b2.a();
                    this.a[1] = b2.a();
                    this.a[2] = b2.a();
                    this.a[2] = 0;
                    this.a[1] = (short)(this.a[1] + a.B);
                    this.a[2] = (short)(this.a[2] + a.C);
                    return;
                }
                case 61: {
                    this.a[3] = b2.a();
                    this.a[4] = b2.a();
                    this.a[5] = b2.a();
                    this.a[1] = b2.a();
                    this.a[2] = b2.a();
                    this.a[1] = (short)(this.a[1] + a.B);
                    this.a[2] = (short)(this.a[2] + a.C);
                    return;
                }
                case 62: {
                    return;
                }
                case 63: {
                    this.a[1] = (byte)b2.read();
                    return;
                }
                case 64: {
                    this.a[1] = (byte)b2.read();
                    return;
                }
                case 65: {
                    this.a[1] = b2.a();
                    return;
                }
                case 80: {
                    this.a[2] = b2.a();
                    return;
                }
                case 81: {
                    this.a[2] = b2.a();
                    this.a[0] = (byte)b2.read();
                    this.a[1] = (byte)b2.read();
                    this.a[2] = (byte)b2.read();
                    return;
                }
                case 82: {
                    this.a[2] = b2.a();
                    this.a[3] = b2.a();
                    this.a[4] = b2.a();
                    this.a[5] = b2.a();
                    this.a[6] = b2.a();
                    this.a[7] = b2.a();
                    this.a[8] = b2.a();
                    return;
                }
                case 83: {
                    this.a[2] = b2.a();
                    this.a[3] = b2.a();
                    this.a[4] = b2.a();
                    this.a[5] = b2.a();
                    this.a[6] = b2.a();
                    this.a[7] = b2.a();
                    return;
                }
                case 84: {
                    this.a[2] = b2.a();
                    this.a[0] = (byte)b2.read();
                    this.a[1] = (byte)b2.read();
                    return;
                }
                case 85: {
                    this.a[2] = b2.a();
                    return;
                }
                case 86: {
                    this.a[0] = (byte)b2.read();
                    this.a[1] = (byte)b2.read();
                    this.a[2] = (byte)b2.read();
                    this.a[3] = (byte)b2.read();
                    this.a[4] = (byte)b2.read();
                    this.a[5] = (byte)b2.read();
                    return;
                }
                case 87: {
                    this.a[4] = b2.a();
                    this.a[2] = b2.a();
                    this.a[3] = b2.a();
                    this.a[2] = (short)(this.a[2] + a.B);
                    this.a[3] = (short)(this.a[3] + a.C);
                    return;
                }
                case 88: {
                    this.a[2] = b2.a();
                    n2 = 96;
                    continue block24;
                }
                case 89: {
                    this.a[2] = b2.a();
                    n2 = 96;
                    continue block24;
                }
                case 90: {
                    this.a[4] = b2.a();
                    this.a[2] = b2.a();
                    this.a[3] = b2.a();
                    this.a[2] = (short)(this.a[2] + a.B);
                    this.a[3] = (short)(this.a[3] + a.C);
                    return;
                }
                case 91: {
                    this.a[2] = b2.a();
                    return;
                }
                case 92: {
                    return;
                }
                case 93: {
                    this.a[2] = b2.a();
                    this.a[0] = (byte)b2.read();
                    this.a[1] = (byte)b2.read();
                    return;
                }
                case 94: {
                    this.a[4] = b2.a();
                    this.a[0] = (byte)b2.read();
                    this.a[2] = b2.a();
                    this.a[3] = b2.a();
                    this.a[2] = (short)(this.a[2] + a.B);
                    this.a[3] = (short)(this.a[3] + a.C);
                    return;
                }
                case 96: {
                    this.a[0] = (byte)b2.read();
                    return;
                }
            }
            return;
        } while (true);
    }

    final boolean a(int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        switch (this.a) {
            case 60: {
                n7 = this.a[1];
                n6 = this.a[2];
                n5 = this.a[3];
                n4 = this.a[4];
                break;
            }
            case 61: {
                n7 = this.a[1];
                n6 = this.a[2];
                n5 = this.a[3];
                n4 = this.a[4];
            }
        }
        return n2 >= n7 && n3 >= n6 && n2 <= n5 + n7 && n3 <= n4 + n6;
    }

    final void b() {
        s s2 = a.a(this.a[0]);
        if (!s2.a) {
            s2.a = true;
            s2.a[0] = 0;
        }
        if (this.a[0] > 0) {
            this.a = false;
        }
    }
}

