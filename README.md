# 訊息提示元件（Kotlin）

## Toast
`Toast.make(this, "Message", Toast.LENGTH_SHORT).show()`

:::danger
toast.view 已經被棄用
客製化的部分已經棄用了
:::


## Snackbar
![](https://i.imgur.com/QqwhIfp.png)

## 按鈕AlertDialog
![](https://i.imgur.com/qv8iW05.png)



## ListAlertDialog
用 setItems(ArrayData) 取代 setMessage 

![](https://i.imgur.com/j0y9kbS.png)


## RadioButtonAlertDialog

checkedItem：預選哪一個RadioButton

![](https://i.imgur.com/K0vu9Pl.png)

----
1. Toast & SnackBar 都是用 make
2. AlertDialog 是用 builder(this)


###### tags: `kotlin`
