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
      domain.put(new String((String)"001"), "�Տ������x���V�X�e�����݃t���O");
      domain.put(new String((String)"002"), "SAS���݃t���O");
      domain.put(new String((String)"003"), "SAS�Ή��o�[�W����");
      domain.put(new String((String)"004"), "�K�i���m�F�[CRFID");
      domain.put(new String((String)"005"), "���[�J���f�[�^�x������");
      domain.put(new String((String)"006"), "���[�J���f�[�^�폜����");
      domain.put(new String((String)"007"), "�o�͐�p�X");
      domain.put(new String((String)"008"), "DM�����R�[�h");
      domain.put(new String((String)"009"), "�{�݌����ӔC�Ҍ����R�[�h");
      domain.put(new String((String)"010"), "���������ǌ����R�[�h");
      domain.put(new String((String)"011"), "ODM�o�[�W����");
      domain.put(new String((String)"012"), "SDTM�o�[�W����");
      domain.put(new String((String)"013"), "�{�ݕs��ID");
      domain.put(new String((String)"014"), "��ƕ⏕�Ҍ����R�[�h");
      domain.put(new String((String)"015"), "�ő�G���[����");
      domain.put(new String((String)"016"), "����CRFID");
      domain.put(new String((String)"017"), "NetCommons�T�[�o");
      domain.put(new String((String)"018"), "���j�^�[�����R�[�h");
      domain.put(new String((String)"019"), "CSV��؂蕶��");
      domain.put(new String((String)"020"), "�A�b�v���[�h�t�@�C������ێ���");
      domain.put(new String((String)"021"), "�b�q�b�����������R�[�h");
      domain.put(new String((String)"022"), "�����҂����������R�[�h");
      domain.put(new String((String)"023"), "�S�������������R�[�h");
      domain.put(new String((String)"024"), "CRF���J���ő�I��");
      domain.put(new String((String)"025"), "PDF�o�͍ő�I��");
      domain.put(new String((String)"900"), "SMTP���ް�̻��ް��");
      domain.put(new String((String)"901"), "SMTP���ް���߰Ĕԍ�");
      domain.put(new String((String)"902"), "SMTP���ް�̔F�ؕ��@���w��");
      domain.put(new String((String)"903"), "SMTP���ް�̑��M��հ�ް��");
      domain.put(new String((String)"904"), "SMTP���ް�̑��M���߽ܰ��");
      domain.put(new String((String)"906"), "���M�҃��[���A�h���X");
      domain.put(new String((String)"907"), "���M�Җ�");
      domain.put(new String((String)"908"), "���[���^�C�g��");
      domain.put(new String((String)"909"), "���[���{��");
      domain.put(new String((String)"905"), "SMTP���ް�̑��M���߽ܰ�ވÍ����L�[");
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

