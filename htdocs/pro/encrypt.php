<?php
  
  // The plain text password to be hashed
  $plaintext_password = "Password@123";
  
  // The hash of the password that
  // can be stored in the database
  $hash = password_hash($plaintext_password, 
          PASSWORD_DEFAULT);
  
  // Print the generated hash
  echo "Generated hash: ".$hash;
  $pad_value = 16-(strlen($value) % 16);
  $pad_value = 16-(strlen("123456789abcdefghijklmnopqrstuvwxy") % 16);
$pad_value = 16-(34 % 16);
$pad_value = 16-(2);
$pad_value = 14;
function mysql_aes_key($key)
{
    $new_key = str_repeat(chr(0), 16);
    for($i=0,$len=strlen($key);$i<$len;$i++)
    {
        $new_key[$i%16] = $new_key[$i%16] ^ $key[$i];
    }
    return $new_key;
}
$decrypted_value = rtrim($decrypted_value, "..16");
function aes_encrypt($val)
{
    $key = mysql_aes_key('Ralf_S_Engelschall__trainofthoughts');
    $pad_value = 16-(strlen($val) % 16);
    $val = str_pad($val, (16*(floor(strlen($val) / 16)+1)), chr($pad_value));
    return mcrypt_encrypt(MCRYPT_RIJNDAEL_128, $key, $val, MCRYPT_MODE_ECB, mcrypt_create_iv( mcrypt_get_iv_size(MCRYPT_RIJNDAEL_128, MCRYPT_MODE_ECB), MCRYPT_DEV_URANDOM));
}
function aes_decrypt($val)
{
    $key = mysql_aes_key('Ralf_S_Engelschall__trainofthoughts');
    $val = mcrypt_decrypt(MCRYPT_RIJNDAEL_128, $key, $val, MCRYPT_MODE_ECB, mcrypt_create_iv( mcrypt_get_iv_size(MCRYPT_RIJNDAEL_128, MCRYPT_MODE_ECB), MCRYPT_DEV_URANDOM));
    return rtrim($val, "..16");
}
define('MY_KEY','Ralf_S_Engelschall__trainofthoughts');

// Group 1
$a = $this->User->aes_encrypt('test');
echo base64_encode($a).'
';

$result = $this->User->query("SELECT AES_ENCRYPT('test', '".MY_KEY."') AS enc");
$b = $result[0][0]['enc'];
echo base64_encode($b).'
';

// Group 2
$result = $this->User->query("SELECT AES_DECRYPT('".$a."', '".MY_KEY."') AS decc");
$c = $result[0][0]['decc'];
echo $c."
";

$d = $this->User->aes_decrypt($b);
echo $d."
";

// Comparison
var_dump($a===$b);
var_dump($c===$d);
?>