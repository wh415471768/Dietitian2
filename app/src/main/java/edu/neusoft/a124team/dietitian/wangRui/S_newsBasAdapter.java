package edu.neusoft.a124team.dietitian.wangRui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import edu.neusoft.a124team.dietitian.R;

/**
 * Created by wang5 on 2016/6/10.
 */
public class S_newsBasAdapter extends BaseAdapter {
    private Context context;

    private List<HashMap<String,String>> data;
    public S_newsBasAdapter(Context context,List<HashMap<String, String>> data) {
        this.context=context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.s_news_listitem,null);
            viewHolder.img=(ImageView)convertView.findViewById(R.id.s_home_newsImg);
            viewHolder.txtTitle=(TextView)convertView.findViewById(R.id.s_thyListContent_newsTitle);
            viewHolder.txtContent=(TextView)convertView.findViewById(R.id.s_home_newsContent);

            convertView.setTag(viewHolder);


        }

        else{
            viewHolder=(ViewHolder)convertView.getTag();
        }

        viewHolder.img.setImageResource(Integer.parseInt(data.get(position).get("Img")));
        viewHolder.txtContent.setText(data.get(position).get("Content"));

        return convertView;
    }
}

class ViewHolder{
    ImageView img;
    TextView txtTitle;

    TextView txtContent;
}

