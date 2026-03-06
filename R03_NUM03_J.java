// Rule 03 NUM03-J
// Use integer types that can fully represent unsigned data

import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {

    public static int getIntegerBad(DataInputStream is) throws IOException {
        return is.readInt();
    }

    public static long getIntegerGood(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL;
    }
}
