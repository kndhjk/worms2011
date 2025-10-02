/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class d {
    public short a;
    public d a;
    public d b;
    public d[] a;
    public short b;
    public short c;
    public boolean a;
    public boolean b;
    public int a;
    public q a;
    public q b;
    public int[] a;
    public q[] a;

    public d() {
    }

    public d(int n2) {
        this.a = (short)n2;
        switch (n2) {
            default: {
                this.a = new d(2);
                return;
            }
            case 1: {
                this.a = null;
                this.b = (short)255;
                this.b = new d(3);
                this.c = ae.b(this);
                ae.a.a = this;
                d[] dArray = new d[1];
                for (n2 = 0; n2 <= 0; ++n2) {
                    dArray[0] = new d(0);
                }
                this.a = dArray;
                return;
            }
            case 2: {
                this.b = (short)255;
                return;
            }
            case 3: 
        }
        this.a = new q[ae.a];
        this.a = new int[ae.a];
    }
}

