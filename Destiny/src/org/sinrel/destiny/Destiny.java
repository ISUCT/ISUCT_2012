package org.sinrel.destiny;

import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

public class Destiny extends Activity implements OnClickListener {
	
	private String messages[] = { 
			"���� �� �������� ����������, ����� �� �������� ���� �����",
			"���� ������� � ����� �������� ����� ������ ��������",
			"���-�� ��������� �������� ��� ��������� ���",
			"����� ����� ������ ������ ��������",
			"�� ��� ���� �����: �������� �� �������� �� � ����� ������!",
			"����� �� ��� ������ ������ � �����-�� ��������, ��� �����, ������ ��� ���������",
			"� ���� ����� ������ ����� �����, ��� ����������� �������� �� ���� ��������",
			"������ ���������: ��� ����� ��������!",
			"����������� ������������� � ������ ���������: ���-�� ����� �������� ��� � ����� �������� ������",
			"�� ��������� �� ��������!",
			"��������� ��� ����� � ������: ��� ����� ���������",
			"�������� ������ ���!",
			"��������� ����� �������� ����� ��������� �����������",
			"����� ������ ��� ����� � ������� ��� ����",
			"�� � �� ������ ����!",
			"���, �������, ������� �������� ����������� �����",
			"��� ������� ������� � ������������",
			"��, � ���� �� ����������, �� ����� ����� ������",
			"������� �������������� ����������� �������� � ����������",
			"���������� ����, ������� �� ��������, ������ ���������� ���",
			"�������� �� ���, ��� ��� �������",
			"�����������, ������� ��� �������, ��� �� �������",
			"������ � ������ ������: ����, � ������� �� �������, � ������!",
			"���� ���� ���������",
			"� �������� ��� �� ���������� � ������ ����������",
			"����� ������, ���� �� �� ������ ������� ������ �������",
			"��� ��� ��������� ����� �������� � ���������",
			"�� ������ ����� �� ����� ������ ������ �����",
			"����, � ������� �� ���� �� ��� ���, ����������",
			"������ � ������ ���������� ������ ����� ��������, ��� ����������"
	};
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ImageView iv = (ImageView) findViewById( R.id.button );
		iv.setOnClickListener(this);
	}
	
	@SuppressWarnings("deprecation")
	public void onClick(View v) {
		showDialog (RESULT_OK);
	}
	
	private String getMessage() {
		int n = new Random().nextInt( messages.length );
		
		return messages[ n ];
	}
	
	@Override
	protected void onPrepareDialog(int id, Dialog dialog) {
		((AlertDialog) dialog).setMessage( getMessage() );
	};
	
	@Override
	protected Dialog onCreateDialog(int id) {
		AlertDialog.Builder b = new AlertDialog.Builder(this);
		
		b.setMessage( "" );
		
		b.setCancelable(true)
			.setPositiveButton("��", 
					new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							dialog.cancel();
						}
					});
		
		return b.create();
	}
}
