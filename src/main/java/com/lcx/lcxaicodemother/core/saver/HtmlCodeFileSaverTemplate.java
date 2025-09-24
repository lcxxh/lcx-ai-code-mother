package com.lcx.lcxaicodemother.core.saver;

import cn.hutool.core.util.StrUtil;
import com.lcx.lcxaicodemother.ai.model.HtmlCodeResult;
import com.lcx.lcxaicodemother.exception.BusinessException;
import com.lcx.lcxaicodemother.exception.ErrorCode;
import com.lcx.lcxaicodemother.model.enums.CodeGenTypeEnum;

/**
 * projectName:lcx-ai-code-mother
 * author:LiuChenXi
 * time:2025/9/23 18:21
 * description:Html代码文件保存器
 */
public class HtmlCodeFileSaverTemplate extends CodeFileSaverTemplate<HtmlCodeResult>{
    @Override
    protected CodeGenTypeEnum getCodeType() {
        return CodeGenTypeEnum.HTML;
    }

    @Override
    protected void saveFiles(HtmlCodeResult result, String baseDirPath) {
        //保存HTML文件
        writeToFile(baseDirPath,"index.html", result.getHtmlCode());
    }

    @Override
    protected void validateInput(HtmlCodeResult result) {
        super.validateInput(result);
        //HTML代码不能为空
        if(StrUtil.isBlank(result.getHtmlCode())){
           throw new BusinessException(ErrorCode.SYSTEM_ERROR, "HTML代码内容不能为空");
        }
    }
}
