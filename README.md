# MarqueenTextView
有跑马灯显示功能的TextView。

## 效果图
![](https://github.com/reallin/github.picture.io/blob/master/marqeen1.png)
![](https://github.com/reallin/github.picture.io/blob/master/marqeen2.png)
## 实现代码
```java

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

```

## 使用方法
布局中直接添加：
```html

<com.lxj.marqueetextview.MarqueeTextView
                android:id="@+id/home_location_tv"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_marginLeft="10dp"
                android:layout_marginRight="10dp"
                android:layout_weight="1"
                android:ellipsize="marquee"
                android:focusable="true"
                android:focusableInTouchMode="true"
                android:gravity="center"
                android:marqueeRepeatLimit="marquee_forever"
                android:scrollHorizontally="true"
                android:singleLine="true"
                android:text="正在定位..."
                android:textColor="#39ac69"
                android:textSize="18sp" />
                
```
