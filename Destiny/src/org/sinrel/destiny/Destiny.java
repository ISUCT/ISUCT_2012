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
			"Если Вы проявите инициативу, успех не заставит себя ждать",
			"Ваши надежды и планы сбудутся сверх всяких ожиданий",
			"Кто-то старается помешать или навредить Вам",
			"Очень скоро придет важное известие",
			"На все воля Божья: повлиять на ситуацию не в Вашей власти!",
			"Ответ на Ваш вопрос связан с каким-то мужчиной, воз можно, хорошо Вам известным",
			"В Вашу жизнь войдет нечто новое, что значительно повлияет на Вашу личность",
			"Будьте осторожны: Вас хотят обмануть!",
			"Внимательно присмотритесь к своему окружению: кто-то может подвести Вас в самый решающий момент",
			"Вы надеетесь не напрасно!",
			"Проверьте все замки и запоры: Вас могут обокрасть",
			"Проблема внутри Вас!",
			"Результат Ваших действий может оказаться неожиданным",
			"Время осушит все слезы и исцелит все раны",
			"Вы — на верном пути!",
			"Вам, наконец, удастся отпереть заржавевший замок",
			"Вас ожидают тревоги и беспокойства",
			"То, к чему Вы стремитесь, не стоит ваших усилий",
			"Главная характеристика сложившейся ситуации — невежество",
			"Результаты дела, которое Вы задумали, сильно разочаруют Вас",
			"Проблема не там, где Вам кажется",
			"Предложение, которое Вам сделают, Вас не устроит",
			"Вперед и только вперед: дело, о котором Вы думаете, — правое!",
			"Ваша цель достижима",
			"В одиночку Вам не справиться с вашими проблемами",
			"Успех придет, если Вы не будете слушать ничьих советов",
			"Для Вас наступило время сомнений и колебаний",
			"От посева зерна до жатвы должно пройти время",
			"Тьма, в которой Вы жили до сих пор, рассеялась",
			"Разрыв в личных отношениях сейчас более вероятен, чем примирение"
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
			.setPositiveButton("ОК", 
					new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							dialog.cancel();
						}
					});
		
		return b.create();
	}
}
