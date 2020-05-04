package com.example.customview.adapter;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.customview.R;
import com.example.customview.bean.TypeBean;

import java.util.List;

/**
 *      date    : 2018/05/14
 */

public class MainAdapter extends BaseQuickAdapter<TypeBean,BaseViewHolder> {

    public MainAdapter( @Nullable List<TypeBean> data) {
        super(R.layout.adapter_item_main, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TypeBean item) {
        helper.setText(R.id.title_tv,item.getTitle());
    }
}
