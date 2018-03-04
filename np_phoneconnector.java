using NoPixelDevMode
using FiveM
using np_config.Java
using FiveM-Resources.net


    public FiveM phone;
    private NoPixelDevMode call;


    public phone()
    {
      If Local.player = ({ONLINE}).(TogglePhone) data = 'Phone' Then
      <SubLine><name>"Call Taxi"</name><color>0515621</color></SunLine>
      End If
      Local -1 Ped calltaxi('Phone' data == np_phoneconnector(1))
    }
  End

    private call()
    {
      calltaxi.ToString = {Caller} ( data = 'caller' )
      Function call = calltaxi( data = 'Call Taxi' )
      Local.player = ({ONLINE}) ( Waypoint.Set = {Caller} )
      NoPixelDevModeData.Save = true
      Function NoPixelDevMode:NoPixelDevModeData = (Function = 1);
    }
  End

  // Requirments
# sv_cheats 0
# np_premium 1
# np_phone 1
# enableCustomData 1
    <body><name>"TogglePhone"</name></body>
End)
