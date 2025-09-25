package com.lcx.lcxaicodemother.service;

import com.lcx.lcxaicodemother.model.dto.app.AppQueryRequest;
import com.lcx.lcxaicodemother.model.entity.User;
import com.lcx.lcxaicodemother.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.lcx.lcxaicodemother.model.entity.App;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 *  服务层。
 *
 * @author lcx
 */
public interface AppService extends IService<App> {

    /**
     * 获取应用封装类
     * @param app
     * @return AppVo
     */
    AppVO getAppVO(App app);

    /**
     * 构造应用查询条件
     * @param appQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    /**
     * 获取应用封装列表
     * @param appList
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 通过对话生成应用代码
     * @param appId  应用Id
     * @param message  提示词
     * @param loginUser  登录用户
     * @return
     */

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);
}
