package cn.langya;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author LangYa466
 * @since 2/6/2025
 */
@SuppressWarnings({"LoggingSimilarMessage"})
public class LogUtil {
    public static Logger logger;

    static {
        logger = LogManager.getLogger("LogUtil");
    }

    /**
     * 记录信息日志，可以包含格式化参数
     *
     * @param message 日志消息
     * @param args    格式化参数
     */
    public static void info(String message, Object... args) {
        logger.info(message, args);
    }

    /**
     * 记录警告日志，可以包含格式化参数
     *
     * @param message 日志消息
     * @param args    格式化参数
     */
    public static void warn(String message, Object... args) {
        logger.warn(message, args);
    }

    /**
     * 记录错误日志，可以包含格式化参数
     *
     * @param message 日志消息
     * @param args    格式化参数
     */
    public static void error(String message, Object... args) {
        logger.error(message, args);
    }

    /**
     * 记录异常错误日志
     *
     * @param e 异常对象
     */
    public static void error(Exception e) {
        logger.error(e);
    }

    /**
     * 记录调试日志，可以包含格式化参数
     *
     * @param message 日志消息
     * @param args    格式化参数
     */
    public static void debug(String message, Object... args) {
        logger.debug(message, args);
    }
}
