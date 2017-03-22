package sdl2

import scala.scalanative.native
import scalanative.native._

@native.link("SDL2")
@native.extern
object sdl {

  /**
    *  This function initializes the subsystems specified by @flags
    */
  def SDL_Init(flags: UInt): CInt = native.extern

  /**
    *  This function cleans up all initialized subsystems. You should
    *  call it upon all exit conditions.
    */
  def SDL_Quit(): Unit = native.extern

  def SDL_GetError(): CString = native.extern
}

object sdl_constants {
  final val SDL_INIT_VIDEO = 0x00000020.toUInt
}