package net.yasite.service;

import net.yasite.api.BaseAPI;
import net.yasite.api.WeiXinAPI;
import net.yasite.api.params.WeiXinParams;
import net.yasite.entity.Friend;
import android.content.Context;
import android.util.Log;

public class WeiXinService extends BaseService {

	public WeiXinService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
    public Friend getWeiXinList(){
    	WeiXinParams pm=new WeiXinParams();
    	pm.setPage("1");
    	BaseAPI api=new WeiXinAPI(context, pm);
    	try {
			if(api.doGet()){
				//Log.e("---------", api.getHandleResult().toString());
			return 	(Friend) api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
}
