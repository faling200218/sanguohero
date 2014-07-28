package com.sg.sghero.db;

import android.content.ContentValues;

/**
 * �����࣬������װ����������Ʒ������Ʒ���ռ�Ʒ
 */
public abstract class Props extends DbObject {
	protected boolean stackable = false;
	private int amount = 1;
	private boolean useable = false;
	private String photo;

	@Override
	protected void createFromContentValues(ContentValues cv) {

	}
	

	public boolean isStackable() {
		return stackable;
	}
	public int getAmount() {
		return amount;
	}
	
	public void amountPlus(){
		amount ++;
	}
	public void amountReduce(){
		amount --;
	}
	public boolean isUseable() {
		return useable;
	}
	public String getPhotoString() {
		return photo;
	}


	public static final String TABLE_NAME = "props";
	public static final String FIELD_STACKABLE = "stackable";
	public static final String FIELD_AMOUNT = "amount";
	public static final String FILED_USEABLE = "useable";
	public static final String FILED_PHOTO = "photo";
}
