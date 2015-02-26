package net.yasite.model;

import net.yasite.entity.Friend;
import net.yasite.service.WeiXinService;
import android.content.Context;

public class WeiXinModel extends Model {
	 WeiXinService xinService;

	public WeiXinModel(Context context) {
		this.context = context;
		xinService = new WeiXinService(context);
	}
	public Friend RequestweixinList() {
	  return xinService.getWeiXinList();
	
	}
}
