/*
 * Decompiled with CFR 0.152.
 */
public final class x {
    public short[] a;

    public x() {
        ae.a(new short[]{0}, 0, this);
    }

    public x(short[] sArray) {
        ae.a(sArray, ae.a(sArray), this);
    }

    public final boolean equals(Object object) {
        if (object instanceof x) {
            int n2;
            block4: {
                object = (x)object;
                n2 = ae.a(this.a);
                if (ae.a(((x)object).a) != n2) {
                    n2 = 0;
                } else {
                    object = ((x)object).a;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        if (this.a[i2] == object[i2]) continue;
                        n2 = 0;
                        break block4;
                    }
                    n2 = 1;
                }
            }
            return n2 != 0;
        }
        return false;
    }
}

