package com.lxj.marqueetextview;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;

public class MarqueeTextView extends TextView {

	public MarqueeTextView(Context con) {
		super(con);
	}

	public MarqueeTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MarqueeTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public boolean isFocused() {
		// TODO Auto-generated method stub
		if(getEditableText().equals(TruncateAt.MARQUEE)){
			return true;
		}
		return super.isFocused();
	}

	

}
