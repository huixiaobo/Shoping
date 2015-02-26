package net.yasite.adapter;


import java.util.List;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import net.yasite.entity.Data;
import net.yasite.entity.Friend;

import net.yasite.test.BaseApplication;
import net.yasite.test.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class WeiXinAdapter extends BaseAdapter {
 List<Data> list;
  Context context;
  private ImageLoader mImageLoader;
  private DisplayImageOptions options;
	
	public WeiXinAdapter(List<Data> list, Context context) {
	super();
	this.list = list;
	this.context = context;
	mImageLoader = BaseApplication.initImageLoader(context);
	options = new DisplayImageOptions.Builder()
	.bitmapConfig(Bitmap.Config.RGB_565)
	.showStubImage(R.drawable.ic_launcher)
    .showImageForEmptyUri(R.drawable.ic_launcher)
    .showImageOnFail(R.drawable.ic_launcher)
	.cacheInMemory(true)
	.cacheOnDisc(true)
	.build();
}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		Log.e("-------", list.toString());
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View v, ViewGroup parent) {
		// TODO Auto-generated method stub
		Viewhodler h;
		if(v==null){
			v=LayoutInflater.from(context).inflate(R.layout.weixin_list,null);
			h=new Viewhodler();
			h.image_tilte=(ImageView) v.findViewById(R.id.image_user);
			h.image_content=(ImageView) v.findViewById(R.id.image_content);
			h.text_user=(TextView) v.findViewById(R.id.text_username);
			h.text_content=(TextView) v.findViewById(R.id.text_content);
			h.text_time=(TextView) v.findViewById(R.id.text_time);
			v.setTag(h);
		}else{
			h=(Viewhodler) v.getTag();
		}
		mImageLoader.displayImage( list.get(position).getAuthor()
				.getAvatar(), h.image_tilte, options);
		
		h.text_user.setText(list.get(position).getAuthor().getUsername());
		h.text_content.setText(list.get(position).getContent());
		h.text_time.setText(list.get(position).getCreated_at());
		
		return v;
		
	}
	
      
	class Viewhodler{
		ImageView image_tilte,image_content;
		TextView text_user,text_content,text_time;
		
	}
	
}
