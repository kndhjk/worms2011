/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class h
implements k {
    byte a;
    int a = (byte)-1;
    int b = 0;
    int c;
    int d;
    int e = 0;
    int f = 0;
    int g = 0;
    int h = 0;
    int i = 0;
    int j = 0;
    int k;
    int l = 0;
    int m = 0;
    int n = 0;
    int o = 0;
    int p = 0;
    int q = -1;

    h() {
    }

    final int a(h h2) {
        int n2;
        if (h2 == null) {
            return 1;
        }
        if (this.a == -1) {
            return -1;
        }
        if (this.b <= 0 && h2.b > 0) {
            return 1;
        }
        if (this.b > 0 && h2.b <= 0) {
            return -1;
        }
        if (this.a > 0 && h2.a <= 0) {
            return 1;
        }
        if (this.a <= 0 && h2.a > 0) {
            return -1;
        }
        if (this.q == h2.q) {
            if (this.b() < h2.b()) {
                return -1;
            }
            return 1;
        }
        int n3 = this.a();
        if (n3 < (n2 = h2.a()) * 5 / 6) {
            return -1;
        }
        return 1;
    }

    private int a() {
        int n2 = this.a;
        int n3 = this.b;
        Math.abs(this.e - this.i);
        Math.abs(this.f - this.j);
        return (n2 + 25 << 16) / (n3 + 25);
    }

    private int b() {
        int n2 = 0;
        switch (this.q) {
            case 0: {
                int n3 = y.c((Math.abs(this.i - this.g) + Math.abs(this.j - this.h)) / 960, 65536);
                n2 = 0 - n3 * 1000;
                n3 = y.c((Math.abs(this.e - this.i) + Math.abs(this.f - this.j)) / 960, 65536);
                n2 -= n3 * 500;
                n3 = (this.a - this.b) / 100;
                n2 += n3 * 230;
                break;
            }
            case 1: {
                int n4 = y.c((Math.abs(this.i - this.g) + Math.abs(this.j - this.h)) / 960, 65536);
                n2 = 0 - n4 * 20;
                n4 = y.c((Math.abs(this.e - this.i) + Math.abs(this.f - this.j)) / 960, 65536);
                n2 -= n4 * 20;
                n4 = (this.a - this.b) / 20;
                n2 += n4 * 5;
                break;
            }
            case 3: {
                n2 = this.a - this.b;
            }
        }
        return n2;
    }
}

