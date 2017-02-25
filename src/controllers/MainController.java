package controllers;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import logic.DrawField;
public class MainController {
	
	public static Object ps1;

@FXML
 public Button b1;
@FXML
 public Button b2;
@FXML
 public Button b3;
@FXML
 public Button b4;
@FXML
 public Button b5;
@FXML
 public Button b6;
@FXML
 public Button b7;
@FXML
 public Button b8;
@FXML
 public Button b9;
@FXML
 public Button b10;
@FXML
 public Button b11;
@FXML
 public Button b12;
@FXML
 public Button b13;
@FXML
 public Button b14;
@FXML
 public Button b15;
@FXML
 public Button b16;
@FXML
 public Button b17;
@FXML
 public Button b18;
@FXML
 public Button b19;
@FXML
 public Button b20;
@FXML
 public Button b21;
@FXML
 public Button b22;
@FXML
 public Button b23;
@FXML
 public Button b24;
@FXML
 public Button b25;
@FXML
 public Button b26;
@FXML
 public Button b27;
@FXML
 public Button b28;
@FXML
 public Button b29;
@FXML
 public Button b30;
@FXML
 public Button b31;
@FXML
 public Button b32;
@FXML
 public Button b33;
@FXML
 public Button b34;
@FXML
 public Button b35;
@FXML
 public Button b36;
@FXML
 public Button b37;
@FXML
 public Button b38;
@FXML
 public Button b39;
@FXML
 public Button b40;
@FXML
 public Button b41;
@FXML
 public Button b42;
@FXML
 public Button b43;
@FXML
 public Button b44;
@FXML
 public Button b45;
@FXML
 public Button b46;
@FXML
 public Button b47;
@FXML
 public Button b48;
@FXML
 public Button b49;
@FXML
 public Button b50;
@FXML
 public Button b51;
@FXML
 public Button b52;
@FXML
 public Button b53;
@FXML
 public Button b54;
@FXML
 public Button b55;
@FXML
 public Button b56;
@FXML
 public Button b57;
@FXML
 public Button b58;
@FXML
 public Button b59;
@FXML
 public Button b60;
@FXML
 public Button b61;
@FXML
 public Button b62;
@FXML
 public Button b63;
@FXML
 public Button b64;
@FXML
 public Button b65;
@FXML
 public Button b66;
@FXML
 public Button b67;
@FXML
 public Button b68;
@FXML
 public Button b69;
@FXML
 public Button b70;
@FXML
 public Button b71;
@FXML
 public Button b72;
@FXML
 public Button b73;
@FXML
 public Button b74;
@FXML
 public Button b75;
@FXML
 public Button b76;
@FXML
 public Button b77;
@FXML
 public Button b78;
@FXML
 public Button b79;
@FXML
 public Button b80;
@FXML
 public Button b81;
@FXML
 public Button b82;
@FXML
 public Button b83;
@FXML
 public Button b84;
@FXML
 public Button b85;
@FXML
 public Button b86;
@FXML
 public Button b87;
@FXML
 public Button b88;
@FXML
 public Button b89;
@FXML
 public Button b90;
@FXML
 public Button b91;
@FXML
 public Button b92;
@FXML
 public Button b93;
@FXML
 public Button b94;
@FXML
 public Button b95;
@FXML
 public Button b96;
@FXML
 public Button b97;
@FXML
 public Button b98;
@FXML
 public Button b99;
@FXML
 public Button b100;
@FXML
 public Button b101;
@FXML
 public Button b102;
@FXML
 public Button b103;
@FXML
 public Button b104;
@FXML
 public Button b105;
@FXML
 public Button b106;
@FXML
 public Button b107;
@FXML
 public Button b108;
@FXML
 public Button b109;
@FXML
 public Button b110;
@FXML
 public Button b111;
@FXML
 public Button b112;
@FXML
 public Button b113;
@FXML
 public Button b114;
@FXML
 public Button b115;
@FXML
 public Button b116;
@FXML
 public Button b117;
@FXML
 public Button b118;
@FXML
 public Button b119;
@FXML
 public Button b120;
@FXML
 public Button b121;
@FXML
 public Button b122;
@FXML
 public Button b123;
@FXML
 public Button b124;
@FXML
 public Button b125;
@FXML
 public Button b126;
@FXML
 public Button b127;
@FXML
 public Button b128;
@FXML
 public Button b129;
@FXML
 public Button b130;
@FXML
 public Button b131;
@FXML
 public Button b132;
@FXML
 public Button b133;
@FXML
 public Button b134;
@FXML
 public Button b135;
@FXML
 public Button b136;
@FXML
 public Button b137;
@FXML
 public Button b138;
@FXML
 public Button b139;
@FXML
 public Button b140;
@FXML
 public Button b141;
@FXML
 public Button b142;
@FXML
 public Button b143;
@FXML
 public Button b144;
@FXML
 public Button b145;
@FXML
 public Button b146;
@FXML
 public Button b147;
@FXML
 public Button b148;
@FXML
 public Button b149;
@FXML
 public Button b150;
@FXML
 public Button b151;
@FXML
 public Button b152;
@FXML
 public Button b153;
@FXML
 public Button b154;
@FXML
 public Button b155;
@FXML
 public Button b156;
@FXML
 public Button b157;
@FXML
 public Button b158;
@FXML
 public Button b159;
@FXML
 public Button b160;
@FXML
 public Button b161;
@FXML
 public Button b162;
@FXML
 public Button b163;
@FXML
 public Button b164;
@FXML
 public Button b165;
@FXML
 public Button b166;
@FXML
 public Button b167;
@FXML
 public Button b168;
@FXML
 public Button b169;
@FXML
 public Button b170;
@FXML
 public Button b171;
@FXML
 public Button b172;
@FXML
 public Button b173;
@FXML
 public Button b174;
@FXML
 public Button b175;
@FXML
 public Button b176;
@FXML
 public Button b177;
@FXML
 public Button b178;
@FXML
 public Button b179;
@FXML
 public Button b180;
@FXML
 public Button b181;
@FXML
 public Button b182;
@FXML
 public Button b183;
@FXML
 public Button b184;
@FXML
 public Button b185;
@FXML
 public Button b186;
@FXML
 public Button b187;
@FXML
 public Button b188;
@FXML
 public Button b189;
@FXML
 public Button b190;
@FXML
 public Button b191;
@FXML
 public Button b192;
@FXML
 public Button b193;
@FXML
 public Button b194;
@FXML
 public Button b195;
@FXML
 public Button b196;
@FXML
 public Button b197;
@FXML
 public Button b198;
@FXML
 public Button b199;
@FXML
 public Button b200;
@FXML
 public Button b201;
@FXML
 public Button b202;
@FXML
 public Button b203;
@FXML
 public Button b204;
@FXML
 public Button b205;
@FXML
 public Button b206;
@FXML
 public Button b207;
@FXML
 public Button b208;
@FXML
 public Button b209;
@FXML
 public Button b210;
@FXML
 public Button b211;
@FXML
 public Button b212;
@FXML
 public Button b213;
@FXML
 public Button b214;
@FXML
 public Button b215;
@FXML
 public Button b216;
@FXML
 public Button b217;
@FXML
 public Button b218;
@FXML
 public Button b219;
@FXML
 public Button b220;
@FXML
 public Button b221;
@FXML
 public Button b222;
@FXML
 public Button b223;
@FXML
 public Button b224;
@FXML
 public Button b225;
@FXML
 public Button b226;
@FXML
 public Button b227;
@FXML
 public Button b228;
@FXML
 public Button b229;
@FXML
 public Button b230;
@FXML
 public Button b231;
@FXML
 public Button b232;
@FXML
 public Button b233;
@FXML
 public Button b234;
@FXML
 public Button b235;
@FXML
 public Button b236;
@FXML
 public Button b237;
@FXML
 public Button b238;
@FXML
 public Button b239;
@FXML
 public Button b240;
@FXML
 public Button b241;
@FXML
 public Button b242;
@FXML
 public Button b243;
@FXML
 public Button b244;
@FXML
 public Button b245;
@FXML
 public Button b246;
@FXML
 public Button b247;
@FXML
 public Button b248;
@FXML
 public Button b249;
@FXML
 public Button b250;
@FXML
 public Button b251;
@FXML
 public Button b252;
@FXML
 public Button b253;
@FXML
 public Button b254;
@FXML
 public Button b255;
@FXML
 public Button b256;
@FXML
 public Button b257;
@FXML
 public Button b258;
@FXML
 public Button b259;
@FXML
 public Button b260;
@FXML
 public Button b261;
@FXML
 public Button b262;
@FXML
 public Button b263;
@FXML
 public Button b264;
@FXML
 public Button b265;
@FXML
 public Button b266;
@FXML
 public Button b267;
@FXML
 public Button b268;
@FXML
 public Button b269;
@FXML
 public Button b270;
@FXML
 public Button b271;
@FXML
 public Button b272;
@FXML
 public Button b273;
@FXML
 public Button b274;
@FXML
 public Button b275;
@FXML
 public Button b276;
@FXML
 public Button b277;
@FXML
 public Button b278;
@FXML
 public Button b279;
@FXML
 public Button b280;
@FXML
 public Button b281;
@FXML
 public Button b282;
@FXML
 public Button b283;
@FXML
 public Button b284;
@FXML
 public Button b285;
@FXML
 public Button b286;
@FXML
 public Button b287;
@FXML
 public Button b288;
@FXML
 public Button b289;
@FXML
 public Button b290;
@FXML
 public Button b291;
@FXML
 public Button b292;
@FXML
 public Button b293;
@FXML
 public Button b294;
@FXML
 public Button b295;
@FXML
 public Button b296;
@FXML
 public Button b297;
@FXML
 public Button b298;
@FXML
 public Button b299;
@FXML
 public Button b300;
@FXML
 public Button b301;
@FXML
 public Button b302;
@FXML
 public Button b303;
@FXML
 public Button b304;
@FXML
 public Button b305;
@FXML
 public Button b306;
@FXML
 public Button b307;
@FXML
 public Button b308;
@FXML
 public Button b309;
@FXML
 public Button b310;
@FXML
 public Button b311;
@FXML
 public Button b312;
@FXML
 public Button b313;
@FXML
 public Button b314;
@FXML
 public Button b315;
@FXML
 public Button b316;
@FXML
 public Button b317;
@FXML
 public Button b318;
@FXML
 public Button b319;
@FXML
 public Button b320;
@FXML
 public Button b321;
@FXML
 public Button b322;
@FXML
 public Button b323;
@FXML
 public Button b324;
@FXML
 public Button b325;
@FXML
 public Button b326;
@FXML
 public Button b327;
@FXML
 public Button b328;
@FXML
 public Button b329;
@FXML
 public Button b330;
@FXML
 public Button b331;
@FXML
 public Button b332;
@FXML
 public Button b333;
@FXML
 public Button b334;
@FXML
 public Button b335;
@FXML
 public Button b336;
@FXML
 public Button b337;
@FXML
 public Button b338;
@FXML
 public Button b339;
@FXML
 public Button b340;
@FXML
 public Button b341;
@FXML
 public Button b342;
@FXML
 public Button b343;
@FXML
 public Button b344;
@FXML
 public Button b345;
@FXML
 public Button b346;
@FXML
 public Button b347;
@FXML
 public Button b348;
@FXML
 public Button b349;
@FXML
 public Button b350;
@FXML
 public Button b351;
@FXML
 public Button b352;
@FXML
 public Button b353;
@FXML
 public Button b354;
@FXML
 public Button b355;
@FXML
 public Button b356;
@FXML
 public Button b357;
@FXML
 public Button b358;
@FXML
 public Button b359;
@FXML
 public Button b360;
@FXML
 public Button b361;
@FXML
 public Button b362;
@FXML
 public Button b363;
@FXML
 public Button b364;
@FXML
 public Button b365;
@FXML
 public Button b366;
@FXML
 public Button b367;
@FXML
 public Button b368;
@FXML
 public Button b369;
@FXML
 public Button b370;
@FXML
 public Button b371;
@FXML
 public Button b372;
@FXML
 public Button b373;
@FXML
 public Button b374;
@FXML
 public Button b375;
@FXML
 public Button b376;
@FXML
 public Button b377;
@FXML
 public Button b378;
@FXML
 public Button b379;
@FXML
 public Button b380;
@FXML
 public Button b381;
@FXML
 public Button b382;
@FXML
 public Button b383;
@FXML
 public Button b384;
@FXML
 public Button b385;
@FXML
 public Button b386;
@FXML
 public Button b387;
@FXML
 public Button b388;
@FXML
 public Button b389;
@FXML
 public Button b390;
@FXML
 public Button b391;
@FXML
 public Button b392;
@FXML
 public Button b393;
@FXML
 public Button b394;
@FXML
 public Button b395;
@FXML
 public Button b396;
@FXML
 public Button b397;
@FXML
 public Button b398;
@FXML
 public Button b399;
@FXML
 public Button b400;
@FXML
 public Button b401;
@FXML
 public Button b402;
@FXML
 public Button b403;
@FXML
 public Button b404;
@FXML
 public Button b405;
@FXML
 public Button b406;
@FXML
 public Button b407;
@FXML
 public Button b408;
@FXML
 public Button b409;
@FXML
 public Button b410;
@FXML
 public Button b411;
@FXML
 public Button b412;
@FXML
 public Button b413;
@FXML
 public Button b414;
@FXML
 public Button b415;
@FXML
 public Button b416;
@FXML
 public Button b417;
@FXML
 public Button b418;
@FXML
 public Button b419;
@FXML
 public Button b420;
@FXML
 public Button b421;
@FXML
 public Button b422;
@FXML
 public Button b423;
@FXML
 public Button b424;
@FXML
 public Button b425;
@FXML
 public Button b426;
@FXML
 public Button b427;
@FXML
 public Button b428;
@FXML
 public Button b429;
@FXML
 public Button b430;
@FXML
 public Button b431;
@FXML
 public Button b432;
@FXML
 public Button b433;
@FXML
 public Button b434;
@FXML
 public Button b435;
@FXML
 public Button b436;
@FXML
 public Button b437;
@FXML
 public Button b438;
@FXML
 public Button b439;
@FXML
 public Button b440;
@FXML
 public Button b441;
@FXML
 public Button b442;
@FXML
 public Button b443;
@FXML
 public Button b444;
@FXML
 public Button b445;
@FXML
 public Button b446;
@FXML
 public Button b447;
@FXML
 public Button b448;
@FXML
 public Button b449;
@FXML
 public Button b450;
@FXML
 public Button b451;
@FXML
 public Button b452;
@FXML
 public Button b453;
@FXML
 public Button b454;
@FXML
 public Button b455;
@FXML
 public Button b456;
@FXML
 public Button b457;
@FXML
 public Button b458;
@FXML
 public Button b459;
@FXML
 public Button b460;
@FXML
 public Button b461;
@FXML
 public Button b462;
@FXML
 public Button b463;
@FXML
 public Button b464;
@FXML
 public Button b465;
@FXML
 public Button b466;
@FXML
 public Button b467;
@FXML
 public Button b468;
@FXML
 public Button b469;
@FXML
 public Button b470;
@FXML
 public Button b471;
@FXML
 public Button b472;
@FXML
 public Button b473;
@FXML
 public Button b474;
@FXML
 public Button b475;
@FXML
 public Button b476;
@FXML
 public Button b477;
@FXML
 public Button b478;
@FXML
 public Button b479;
@FXML
 public Button b480;

@FXML
public Button restart;

	private static final DrawField DF = new DrawField();
	private String valueOfClickedButton;
	private Button buttonToMakeChange;
	private boolean wasClicked = false;
	private boolean isRun = true;
	private Scene sc;
	private String idwka;
	public String curentID;

	@FXML
	private void initialize() {
	}

	@FXML
	public void mouseClick(MouseEvent event) {
		Object source = event.getSource();
		Button clickedButton = (Button) source;
		sc = ((Node) source).getScene();
		valueOfClickedButton = DF.valueOfButton(clickedButton.getId());
		buttonToMakeChange = clickedButton;
		clickedButton.setDisable(true);
		clickedButton.setText(valueOfClickedButton);
		if (valueOfClickedButton == "X") {
			buttonToMakeChange.setStyle(" -fx-base: red;");
			System.out.println("boom");
			gameOver();
			win();
		}
		wasClicked = true;
		isRun = false;
		
		
	}

	public void gameOver() {
		for (int i = 1; i < 101; i++) {
			String curentID = "#b" + i;
			Button nodeToFind = (Button) sc.lookup(curentID);
			if (nodeToFind.isDisable() == false) {
				nodeToFind.setDisable(true);
				nodeToFind.setText(DF.valueOfButton("b" + i));
			}
		}
	}

	public void win() {   
		int count = 0;
		if (count == 1) {
			System.out.println("WIN");
		}
	} 
	
	@FXML
	public void Restart(MouseEvent event) {
		ReloadApp r = new ReloadApp();
		r.start((Stage)ps1);

	}
	
	
}
