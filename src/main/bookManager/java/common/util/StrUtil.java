package bookManager.java.common.util;

import org.junit.Test;

public class StrUtil {
    public static boolean isEmpty(String str) {
        if (str == null) {
            return true;
        } else {
            return "".equals(str.trim()) ? true : false;
        }
    }

    public static boolean isNotEmpty(String str) {
        if (str == null) {
            return false;
        } else {
            return "".equals(str.trim()) ? false : true;
        }
    }


}
