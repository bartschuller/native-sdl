import sdl2.sdl._
import sdl2.sdl_constants._
import scalanative.native._

object Main {
  def main(args: Array[String]): Unit = {
    if (SDL_Init(SDL_INIT_VIDEO) != 0){
      println(s"SDL_Init Error: ${fromCString(SDL_GetError())}")
      System.exit(1)
    }
    SDL_Quit()
  }
}
