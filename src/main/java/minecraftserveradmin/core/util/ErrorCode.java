package minecraftserveradmin.core.util;

public class ErrorCode {
    //用户相关 正常10xx 异常11xx
    public static final Integer LOGIN_SUCCESS = 1000;
    public static final Integer REGISTER_SUCCESS = 1001;
    public static final Integer FILE_UPDATE_SUCCESS = 1002;
    public static final Integer FILE_RENAME_SUCCESS = 1003;
    public static final Integer FILE_DOWNLOAD_SUCCESS = 1004;

    public static final Integer SAME_USER_NAME = 1102;
    public static final Integer NO_USER_FIND = 1103;
    public static final Integer WRONG_PASSWORD = 1104;
    public static final Integer USER_NOT_ONLINE = 1105;
    public static final Integer ADMIN_EARLY_ONLINE = 1106;
    public static final Integer NO_FILE_UPDATE = 1107;
    public static final Integer FILE_RENAME_ERROR= 1108;
    public static final Integer FILE_DOWNLOAD_ERROR = 1009;

}
