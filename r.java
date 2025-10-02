/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class r {
    private f a;
    private Vector a;
    private boolean a;
    private int a;
    private int b = -1;
    private d a = 0;

    public static r a() {
        n n2 = ae.a();
        if (n2.a == null) {
            n2.a = new r();
        }
        return n2.a;
    }

    public final void a(f f2) {
        this.a = f2;
    }

    public final void a(int n2) {
        q q2;
        if (this.a(n2) != -1) {
            return;
        }
        q q3 = q2;
        int n3 = n2;
        q2 = new q(b.a(n3), n2);
        this.a.addElement(q3);
    }

    public final boolean a() {
        return this.a;
    }

    public final void a(boolean bl) {
        this.a = bl;
        if (!bl) {
            this.b();
        }
    }

    public final int a() {
        return ae.a(this.a) * 100 / 255;
    }

    public final void b(int n2) {
        n2 = n2 != 0 && n2 != 1 ? 1 : 0;
        ae.a(n2 != 0, this.a);
    }

    public final void a() {
        this.a = 1;
    }

    public final void c(int n2) {
        if (!this.a) {
            return;
        }
        if (this.a != 1 || !ae.a(this.a)) {
            this.b();
            this.a(n2);
            if (n2 != this.b) {
                int n3 = this.a(n2);
                Object object = ((q)this.a.elementAt((int)n3)).c;
                q q2 = object;
                object = this.a;
                ae.a(q2, (d)object);
                this.b = n2;
            }
            ae.a(this.a);
        }
    }

    public final void b() {
        if (this.b == -1) {
            return;
        }
        int n2 = this.b;
        if (this.b == n2) {
            ae.b(this.a);
        }
    }

    public static void c() {
        ae.a(ae.a());
    }

    private int a(int n2) {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            if (((q)this.a.elementAt((int)i2)).a != n2) continue;
            return i2;
        }
        return -1;
    }
}

