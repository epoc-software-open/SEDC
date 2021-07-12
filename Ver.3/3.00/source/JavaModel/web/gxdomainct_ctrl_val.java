/*
               File: CT_CTRL_VAL
        Description: CT_CTRL_VAL
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:39.3
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainct_ctrl_val
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"001"), "臨床試験支援システム存在フラグ");
      domain.put(new String((String)"002"), "SAS存在フラグ");
      domain.put(new String((String)"003"), "SAS対応バージョン");
      domain.put(new String((String)"004"), "適格性確認票CRFID");
      domain.put(new String((String)"005"), "ローカルデータ警告日数");
      domain.put(new String((String)"006"), "ローカルデータ削除日数");
      domain.put(new String((String)"007"), "出力先パス");
      domain.put(new String((String)"008"), "DM権限コード");
      domain.put(new String((String)"009"), "施設研究責任者権限コード");
      domain.put(new String((String)"010"), "研究事務局権限コード");
      domain.put(new String((String)"011"), "ODMバージョン");
      domain.put(new String((String)"012"), "SDTMバージョン");
      domain.put(new String((String)"013"), "施設不定ID");
      domain.put(new String((String)"014"), "作業補助者権限コード");
      domain.put(new String((String)"015"), "最大エラー件数");
      domain.put(new String((String)"016"), "特殊CRFID");
      domain.put(new String((String)"017"), "NetCommonsサーバ");
      domain.put(new String((String)"018"), "モニター権限コード");
      domain.put(new String((String)"019"), "CSV区切り文字");
      domain.put(new String((String)"020"), "アップロードファイル履歴保持回数");
      domain.put(new String((String)"021"), "ＣＲＣを示す権限コード");
      domain.put(new String((String)"022"), "研究者を示す権限コード");
      domain.put(new String((String)"023"), "全員を示す権限コード");
      domain.put(new String((String)"024"), "CRFを開く最大選択数");
      domain.put(new String((String)"025"), "PDF出力最大選択数");
      domain.put(new String((String)"900"), "SMTPｻｰﾊﾞｰのｻｰﾊﾞｰ名");
      domain.put(new String((String)"901"), "SMTPｻｰﾊﾞｰのﾎﾟｰﾄ番号");
      domain.put(new String((String)"902"), "SMTPｻｰﾊﾞｰの認証方法を指定");
      domain.put(new String((String)"903"), "SMTPｻｰﾊﾞｰの送信者ﾕｰｻﾞｰ名");
      domain.put(new String((String)"904"), "SMTPｻｰﾊﾞｰの送信者ﾊﾟｽﾜｰﾄﾞ");
      domain.put(new String((String)"906"), "送信者メールアドレス");
      domain.put(new String((String)"907"), "送信者名");
      domain.put(new String((String)"908"), "メールタイトル");
      domain.put(new String((String)"909"), "メール本文");
      domain.put(new String((String)"905"), "SMTPｻｰﾊﾞｰの送信者ﾊﾟｽﾜｰﾄﾞ暗号化キー");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        String key )
   {
      if (domain.containsKey( key.trim() ))
      {
         return (String)domain.get( key.trim() );
      }
      else
      {
         return "";
      }
   }

   public static GxObjectCollection getValues( )
   {
      GxObjectCollection value = new GxObjectCollection(String.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((String) itr.next());
      }
      return value;
   }

}

