package net.yasite.api;

import net.yasite.api.params.BaseHttpParam;
import net.yasite.entity.Friend;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;

public class WeiXinAPI extends BaseAPI {

	public WeiXinAPI(Context context, BaseHttpParam pm) {
		super(context, pm);
		// TODO Auto-generated constructor stub
		setMethod("http://www.yasite.net/rss.php");
	}

	@Override
	public Friend handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(), Friend.class);
	}

}
