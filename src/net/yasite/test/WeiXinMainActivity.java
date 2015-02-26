package net.yasite.test;

import java.util.List;

import net.yasite.adapter.WeiXinAdapter;

import net.yasite.entity.Data;
import net.yasite.entity.Friend;

import net.yasite.model.WeiXinModel;
import net.yasite.net.HandlerHelp;
import android.content.Context;
import android.os.Message;
import android.widget.ListView;

public class WeiXinMainActivity extends BaseNewActivity {
	private List<Data> list;
	private  WeiXinAdapter adapter;
	private ListView list_view;
	private WeiXinModel weiXinModel;
	private Context context;
	private Friend friend;

	@Override
	public void setupView() {
		// TODO Auto-generated method stuty
		context=this;
		list_view=(ListView) findViewById(R.id.List_weixin);
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_wei_xin_main);
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		weiXinModel=new WeiXinModel(context);
		
		new WeiXinInfoHandler(context).execute();
		
	}

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}

	class WeiXinInfoHandler extends HandlerHelp{

		public WeiXinInfoHandler(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void updateUI() {
			// TODO Auto-generated method stub
			list=friend.getData();
			
			if(list!=null){
				adapter=new WeiXinAdapter(list, context);
				list_view.setAdapter(adapter);
			}
				
		}

		@Override
		public void doTask(Message msg) throws Exception {
			// TODO Auto-generated method stub
			
			friend= weiXinModel.RequestweixinList();
		}

		@Override
		public void doTaskAsNoNetWork(Message msg) throws Exception {
			// TODO Auto-generated method stub
			
		}
		
	}
}
