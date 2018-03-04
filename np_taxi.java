using FiveM
using np_config.Java
using np_phoneconnector.Java
using NoPixelDevMode


    public np_config.Java taxi;
    private FiveM pedTaxi;
    public NoPixelDevMode drive;


    public taxi()
    {
      If player.calltaxi Then
      Use np_config.Java ((public FiveM call))
      End If
      If No Local.Player = ({ONLINE}) Then
      rec+ 1f = -Local.Ped( TriggerEvent = 'pedTaxi' )
      End If
      Local.Ped = pedTaxi( Set Waypoint = data('Caller') )
      Make Local.Ped = NoPixelDevMode( Drive = Caller.Waypoint ) +1
      If Local.Player = Caller = 1f+ Then
      chatPrint("If you will spam the system you will get banned!")
      chatPrint("Just wait for the Local to come. Please be patient.")
    }
  End

    private pedTaxi()
    {
      Use Function As New Point(0, 0) ToString
      Start pedTaxi = true OnlyIf No Local.Player = ({ONLINE});
    }
  End

  // Requirments
# sv_cheats 0
# np_premium 1
# enableCustomData 1
# np_phoneconnector 1
End)
