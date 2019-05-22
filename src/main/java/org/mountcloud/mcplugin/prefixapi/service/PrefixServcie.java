package org.mountcloud.mcplugin.prefixapi.service;

import java.util.List;

import org.bukkit.entity.Player;
import org.mountcloud.mcplugin.common.service.BaseService;

/** 
 * @author zhanghaishan 
 * @version 创建时间：2018年10月13日 下午6:07:01 
 * TODO:
 */
public interface PrefixServcie extends BaseService {
	
	/**
	 * 添加prefix
	 * @param player 玩家
	 * @param prefix prefix
	 * @return 0 成功，-1 配置初始化失败，-2 配置重复
	 */
	int addPrefix(Player player,String prefix);
	
	/**
	 * 添加删除
	 * @param player 玩家
	 * @param prefix prefix
	 * @return 0 成功，-1 配置初始化失败，-2 配置不存在
	 */
	int removePrefix(Player player,String prefix);
	
	/**
	 * 添加删除
	 * @param player 玩家
	 * @param color 颜色代码
	 * @return 0 成功，-1 配置初始化失败，-2 其他错误
	 */
	int setNickNameColor(Player player,String color);
	
	/**
	 * 返回玩家的所有称号
	 * @param player 玩家
	 * @return 玩家所有称号
	 */
	List<String> getPlayerPrefixs(Player player);
	
	/**
	 * 返回玩家目前使用的称号
	 * @param player 玩家
	 * @return 称号
	 */
	String getPlayerUsePrefix(Player player);
	
	/**
	 * 返回玩家目前的昵称颜色
	 * @param player 玩家
	 * @return 昵称颜色
	 */
	String getPlayUseNikColor(Player player);
	
	/**
	 * 从玩家称号列表中选择一个称号来使用
	 * @param player 玩家
	 * @param index 下标
	 * @return 0成功，-1 配置未加载，-2不存在
	 */
	int usePrefix(Player player,int index);
	
	/**
	 * 卸下称号
	 * @param player 玩家
	 * @return 0成功，-1 配置未加载
	 */
	int unUsePrefix(Player player);
	
	/**
	 * 设置玩家昵称颜色
	 * @param player 玩家
	 * @param color 颜色
	 * @return 0成功，-1 配置未加载，-2其他异常
	 */
	int setPlayerNickColor(Player player,String color);

}
