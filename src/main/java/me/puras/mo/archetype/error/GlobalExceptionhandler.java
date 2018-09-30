package me.puras.mo.archetype.error;

import me.puras.mo.common.error.BusinessException;
import me.puras.mo.common.json.Response;
import me.puras.mo.common.json.ResponseHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionhandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionhandler.class);

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Response businessExceptionHandler(BusinessException ex) {
        logger.info(ex.getMessage());
        ex.printStackTrace();
        return ResponseHelper.createResponse(ex.getErrCode(), ex.getErrDesc());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response exceptionHandler(Exception ex) {
        logger.info(ex.getMessage());
        ex.printStackTrace();
        return ResponseHelper.createExceptionResponse(ex);
    }
}
